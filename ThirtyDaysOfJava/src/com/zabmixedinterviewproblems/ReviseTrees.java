package com.zabmixedinterviewproblems;

class NodeBinary {
    int key;
    NodeBinary left, right;

    public NodeBinary(int item) {
        key = item;
        left = right = null;
    }
}

public class ReviseTrees {
    NodeBinary root;

    public ReviseTrees() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    private NodeBinary insertRec(NodeBinary root, int key) {
        if (root == null) {
            root = new NodeBinary(key);
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

    private void inorderRec(NodeBinary root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key + " ");
            inorderRec(root.right);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(NodeBinary root, int key) {
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

    private int findMinRec(NodeBinary root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty.");

        if (root.left == null)
            return root.key;

        return findMinRec(root.left);

    }

    public  int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(NodeBinary root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty.");

        if (root.right == null)
            return root.key;

        return findMaxRec(root.right);
    }


    public static void main(String[] args) {
        ReviseTrees tree = new ReviseTrees();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal : ");
        tree.inorder();

        int searchKey = 40;
        if (tree.search(searchKey))
            System.out.println("Key " + searchKey + " found in the tree");
        else
            System.out.println("key "+ searchKey + " not found in the tree.");

        System.out.println("Minimum value in the tree : " +tree.findMin());
        System.out.println("MAximum value in the tree : " +tree.findMax());
    }
}
