package com.sudheer.hakers.rank;

import java.util.Scanner;

public class HeightOfTree {

    public static int getHeight(Node node) {
        int leftHeight;
        int rightHeight;
        if (node == null) {
            return -1;
        } else {
            leftHeight = getHeight(node.getLeft());
            rightHeight = getHeight(node.getRight());

            if (leftHeight > rightHeight)
                return (++leftHeight);
            else
                return (++rightHeight);
        }
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);
        Node node6 = new Node(7);
        Node node7 = new Node(8);
        Node node8 = new Node(9);
        Node node9 = new Node(10);
        Node node10 = new Node(11);

        node.setLeft(node1);
        node.setRight(node2);

        node.getLeft().setLeft(node3);
        node.getRight().setLeft(node4);

        node.getLeft().getLeft().setLeft(node5);
        node.getRight().getLeft().setLeft(node6);
        node.getRight().getLeft().setRight(node7);

        node.getLeft().getLeft().getLeft().setRight(node8);
        node.getRight().getLeft().getRight().setLeft(node9);
        node.getRight().getLeft().getRight().setRight(node10);

        System.out.println(getHeight(node));
    }
}
