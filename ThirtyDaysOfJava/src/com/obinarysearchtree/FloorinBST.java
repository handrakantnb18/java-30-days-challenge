package com.obinarysearchtree;

class NodeFloor {
    int data;
    NodeFloor right, left;

    NodeFloor(int item) {
        data =item;
        left = right = null;
    }
}

public class FloorinBST {
    static int floor(NodeFloor root, int item) {
        if (root == null) {
            return -1;
        }

        if (root.data > item){
            return floor(root.left, item);
        }

        int floorValue = floor(root.right, item);

        return (floorValue <= item && floorValue != -1) ? floorValue : root.data;
    }

    public static void main(String[] args) {
        NodeFloor root = new NodeFloor(10);
        root.left = new NodeFloor(5);
        root.right = new NodeFloor(15);
        root.right.left = new NodeFloor(12);
        root.right.right = new NodeFloor(30);

        int item = 14;
        System.out.println(floor(root, item));

    }
}
