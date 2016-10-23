package com.sudheer.hakers.rank;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by Sudheer Babu Gutha.
 */
public class TreeTopView {

    public static void main(String args[]) {
        Node node = new Node(3);
        Node node1 = new Node(5);
        Node node2 = new Node(1);
        Node node3 = new Node(4);
        Node node4 = new Node(9);
        Node node5 = new Node(2);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);

        node.setLeft(node1);
        node.getLeft().setLeft(node2);
        node.getLeft().setRight(node3);
        node.getLeft().getLeft().setRight(node4);

        node.setRight(node5);
        node.getRight().setLeft(node6);
        node.getRight().setRight(node7);
        node.getRight().getRight().setLeft(node8);

        treeTopView(node);
    }

    public static void treeTopView(Node node) {
        Stack<Integer> stack = new Stack<Integer>();
        if (node == null) {
            return;
        }

        List<Integer> list = new ArrayList<Integer>();
        Node tempNode = node.getLeft();
        while (tempNode !=null) {
            list.add(tempNode.getValue());
            tempNode = tempNode.getLeft();
        }

        for(int i =list.size()-1; i>= 0; i--){
           stack.push(list.get(i));
        }
        stack.push(node.getValue());

        tempNode = node.getRight();
        while (tempNode != null) {
            stack.push(tempNode.getValue());
            tempNode = tempNode.getRight();
        }

        for(int value: stack){
            System.out.println(value +" ");
        }
    }
}
