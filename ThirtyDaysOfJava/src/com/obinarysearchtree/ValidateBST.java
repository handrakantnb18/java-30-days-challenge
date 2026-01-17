package com.obinarysearchtree;

class NodeBST {
    int data;
    NodeBST left, right;

    NodeBST(int value) {
        data = value;
        left = right = null;
    }
}

public class ValidateBST {

    static boolean isBST(NodeBST root) {
        NodeBST curr = root;
        NodeBST pre;

        int prevValue = Integer.MIN_VALUE;

        while (curr != null) {
            if (curr.left == null) {
                if (curr.data <= prevValue) {
                    return false;
                }
                prevValue = curr.data;
                curr = curr.right;
            }
            else {
                pre =curr.left;

                while (pre.right != null && pre.right != curr) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = curr;
                    curr = curr.left;
                }
                else
                {
                    pre.right = null;

                    if (curr.data <= prevValue) {
                        return false;
                    }
                    prevValue =curr.data;
                    curr = curr.right;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        NodeBST root = new NodeBST(10);
        root.left = new NodeBST(5);
        root.right = new NodeBST(20);
        root.right.left = new NodeBST(9);
        root.right.right = new NodeBST(25);

        if (isBST(root)) {
            System.out.println("True");
        }else
        {
            System.out.println("False");
        }
    }
}
