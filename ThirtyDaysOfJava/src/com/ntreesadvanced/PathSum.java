package com.ntreesadvanced;

class NodePathSum {
    int data;
    NodePathSum left, right;

    NodePathSum(int key) {
        data = key;
        left = right = null;
    }
}

public class PathSum {

    static boolean hasPathSum(NodePathSum root, int sum) {
        if (root == null)
            return false;

        int subSum = sum - root.data;

        if (subSum == 0 && root.left == null && root.right == null)
            return true;

        boolean left = false, right = false;

        if (root.left != null)
            left = hasPathSum(root.left, subSum);

        if (root.right != null)
            right = hasPathSum(root.right, sum);

        return left || right;
    }

    public static void main(String[] args) {
        int sum = 21;

        NodePathSum item = new NodePathSum(10);
        item.left = new NodePathSum(8);
        item.right = new NodePathSum(2);
        item.left.left = new NodePathSum(3);
        item.left.right = new NodePathSum(5);
        item.right.left = new NodePathSum(2);

        System.out.println(hasPathSum(item, sum));
    }
}
