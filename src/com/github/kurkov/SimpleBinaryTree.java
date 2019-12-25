package com.github.kurkov;

public class SimpleBinaryTree {
    private Node root;

    public void add(int value) {
        root = addNode(root, value);
    }

    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}