package com.ntreesadvanced;

class NodeLeftLeaves {
    int data;
    NodeLeftLeaves left, right;

    NodeLeftLeaves(int item){
        data = item;
        left = right =null;
    }
}

public class SumofLeftLeaves {
    NodeLeftLeaves root;

    boolean isLeaf(NodeLeftLeaves node) {
        if (node == null)
            return false;
        if (node.left == null && node.right == null)
            return true;

        return false;
    }

    int leftLeavesSum(NodeLeftLeaves node) {
        int res = 0;

        if (node != null) {
            if (isLeaf(node.left))
                res+= node.left.data;
            else
                res += leftLeavesSum(node.left);

            res += leftLeavesSum(node.right);
        }
        return res;
    }


    public static void main(String[] args) {

        SumofLeftLeaves sl = new SumofLeftLeaves();
        sl.root = new NodeLeftLeaves(10);
        sl.root.left = new NodeLeftLeaves(5);
        sl.root.right = new NodeLeftLeaves(78);
        sl.root.left.right = new NodeLeftLeaves(55);
        sl.root.left.left = new NodeLeftLeaves(12);
        sl.root.right.left = new NodeLeftLeaves(14);
        sl.root.right.right = new NodeLeftLeaves(25);
        sl.root.left.right.right = new NodeLeftLeaves(56);
        sl.root.right.right.left = new NodeLeftLeaves(99);

        System.out.println("The sum of the leaves is : " +sl.leftLeavesSum(sl.root));
    }
}
