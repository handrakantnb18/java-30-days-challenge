package com.ntreesadvanced;

class NodeBalanceTree {
    int data;
    NodeBalanceTree left, right;

    public NodeBalanceTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CheckBalancedTree {
    private NodeBalanceTree root;

    public void createBalancedTree(int[] sortedArray) {
        root = createBalancedTreeRec(sortedArray, 0, sortedArray.length - 1);
    }

    private NodeBalanceTree createBalancedTreeRec(int[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        NodeBalanceTree node = new NodeBalanceTree(array[mid]);

        node.left = createBalancedTreeRec(array, start, mid - 1);
        node.right = createBalancedTreeRec(array, mid + 1, end);

        return node;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(NodeBalanceTree node) {
        if (node != null) {
            inOrderRec(node.left);
            System.out.println(node.data + " ");
            inOrderRec(node.right);
        }
    }

    public void PreOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(NodeBalanceTree node) {
        if (node != null) {
            System.out.println(node.data + " ");
            preOrderRec(node.left);
            preOrderRec(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderRec(root);
    }

    private void postOrderRec(NodeBalanceTree node) {
        if (node != null) {
            preOrderRec(node.left);
            preOrderRec(node.right);
            System.out.println(node.data + " ");
        }
    }

    public static void main(String[] args) {
        CheckBalancedTree tree = new CheckBalancedTree();
        int[] sortedArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        tree.createBalancedTree(sortedArray);

        System.out.println("In-order traversal of the balanced binary tree : ");
        tree.inOrderTraversal();

        System.out.println("\nPre-order traversal of the balanced binary tree : ");
        tree.postOrderTraversal();

        System.out.println("\n\nPost-order traversal of the balanced binary tree : ");
        tree.postOrderTraversal();
    }
}
