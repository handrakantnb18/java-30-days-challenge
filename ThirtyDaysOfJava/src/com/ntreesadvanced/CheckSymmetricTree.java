package com.ntreesadvanced;
class NodeSymmTree {
    int data;
    NodeSymmTree left, right;

    NodeSymmTree(int value) {
        data = value;
        left = right = null;
    }
}

public class CheckSymmetricTree {

    static boolean isMirror(NodeSymmTree leftSub, NodeSymmTree rightSub) {

        if (leftSub == null && rightSub == null)
            return true;

        if (leftSub == null || rightSub == null
            || rightSub.data != rightSub.data)
            return false;
        return isMirror(leftSub.left, rightSub.right)
                && isMirror(leftSub.right, rightSub.left);
    }

    static boolean isSymmetric(NodeSymmTree root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        NodeSymmTree root = new NodeSymmTree(10);
        root.left = new NodeSymmTree(5);
        root.right = new NodeSymmTree(5);
        root.left.left = new NodeSymmTree(2);
        root.right.right = new NodeSymmTree(2);

        if (isSymmetric(root))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
