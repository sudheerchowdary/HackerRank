package com.sudheer.hakers.rank;

/**
 * Created by Sudheer Babu Gutha.
 */
public class SwappingNodes {

    private Node rootNode;

    public SwappingNodes() {
        this.rootNode = null;
    }

    public Node getRootNode() {
        return rootNode;
    }

    /**
           1               1            [1]
          / \             / \
         2   3     ->    3   2          [2]
         \   \           \   \
          4   5           5   4         [3]
     */

    /**
          1   [s]       1    [s]       1
         / \      ->   / \        ->  / \
        2   3 [s]     3   2  [s]     2   3
     */

    //swaapLeftToRightCase1 supports both above examples
    public void swaapLeftToRightCase1(Node node) {
        if (node != null) {
            Node temp = node.getLeft();
            node.setLeft(node.getRight());
            node.setRight(temp);
        }
    }

    /**
                1                     1                          1
               / \                   / \                        / \
              /   \                 /   \                      /   \
             2     3    [s]        2     3                    2     3
            /      /                \     \                    \     \
           /      /                  \     \                    \     \
          4      5          ->        4     5          ->        4     5
          /      / \                  /     / \                  /     / \
         /      /   \                /     /   \                /     /   \
        6      7     8   [s]        6     7     8   [s]        6     7     8
         \          / \            /           / \              \         / \
          \        /   \          /           /   \              \       /   \
          9      10   11        9           11   10              9     10   11
     */


    public void swapLeftToRightCase2(Node node, int height, int timesToSwap) {

        if (height == 0) {
            node.printValue();
        }

        if (node.getLeft() == null && node.getRight() == null) {
            height = 0;
            return;
        }
        if (height >= timesToSwap && height % 2 != 0) {
            System.out.println();
            System.out.println("Before swapping");
            node.printValue();
            if (node.getLeft() != null)
                node.getLeft().printValue();
            if (node.getRight() != null)
                node.getRight().printValue();
            Node temp = node.getLeft();
            node.setLeft(node.getRight());
            node.setRight(temp);
            System.out.println();
            System.out.println("After swapping");
            node.printValue();
            if (node.getLeft() != null)
                node.getLeft().printValue();
            if (node.getRight() != null)
                node.getRight().printValue();
        }
        if (node != null && node.getLeft() != null)
            swapLeftToRightCase2(node.getLeft(), height + 1,timesToSwap);
        if(node!=null && node.getRight()!=null)
        swapLeftToRightCase2(node.getRight(), height + 1,timesToSwap);
    }

    public static void main(String args[]) {
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

        SwappingNodes rightToLeft = new SwappingNodes();

        rightToLeft.inorder(node);
        int count = 1;
        for(int i =1; i<3; i++) {
            rightToLeft.swapLeftToRightCase2(node, 0, count);
            count = count+2;
        }
        rightToLeft.inorder(node);


    }

    public void inorder(Node node) {
        if (node != null) {
            inorder(node.getLeft());
            node.printValue();
            inorder(node.getRight());
        }
    }
}

