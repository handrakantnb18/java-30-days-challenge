package com.mtreesbasics;


class NodeTree {
    int key;
    NodeTree left, right;

    public NodeTree(int item) {
        key = item;
        left = right = null;
    }
}

public class CreateBinaryTree {
    NodeTree root;

    public CreateBinaryTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private NodeTree insertRec(NodeTree root, int key) {
        if (root == null) {
            root = new NodeTree(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(NodeTree root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(NodeTree root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        if (key < root.key)
            return searchRec(root.left, key);
        else
            return searchRec(root.right, key);
    }

    public int findMin() {
        return findMinRec(root);
    }

    private int findMinRec(NodeTree root) {
        if (root == null)
            throw new IllegalStateException("Tree is Empty...");

        if (root.left == null)
            return root.key;

        return findMinRec(root.left);
    }

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(NodeTree root) {
        if (root == null)
            throw new IllegalStateException("Three is empty...");

        if (root.right == null)
            return root.key;

        return findMaxRec(root.right);
    }

    public static void main(String[] args) {
        CreateBinaryTree tree = new CreateBinaryTree();

        tree.insert(50);
        tree.insert(60);
        tree.insert(20);
        tree.insert(80);
        tree.insert(30);
        tree.insert(10);
        tree.insert(90);

        System.out.println("Inorder traversal : ");
        tree.inorder();

        int searchKey = 40;
        if (tree.search(searchKey))
            System.out.println("\nKey "+ searchKey + " found in the tree.");
        else
            System.out.println("\nKey "+ searchKey + "not found in the key.");

        System.out.println("Minimum value in the tree : " + tree.findMin());

        System.out.println("Maximum value in the tree : " + tree.findMax());
    }
}
