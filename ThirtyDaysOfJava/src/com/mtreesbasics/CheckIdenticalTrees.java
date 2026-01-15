package com.mtreesbasics;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class CheckIdenticalTrees {

    static class NodeTreesCI {
        int data;
        NodeTreesCI left, right;
    }

    static boolean areIdentical(NodeTreesCI root1, NodeTreesCI root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        Queue<NodeTreesCI > q1 = new LinkedList<NodeTreesCI> ();
        Queue<NodeTreesCI > q2 = new LinkedList<NodeTreesCI> ();

        q1.add(root1);
        q2.add(root2);

        while (!q1.isEmpty() && !q2.isEmpty())
        {
            NodeTreesCI n1 = q1.peek();
            NodeTreesCI n2 = q2.peek();

            if (n1.data != n2.data)
                return false;

            q1.remove();
            q2.remove();

            if (n1.left != null && n2.left != null)
            {
                q1.add(n1.left);
                q2.add(n2.left);
            }else if (n1.left != null || n2.left != null)
               return false;

            if (n1.right != null && n2.right != null ) {
                q1.add(n1.right);
                q2.add(n2.right);
            }
            else if (n1.right != null || n2.right != null)
                return false;
        }
        return true;
    }

    static NodeTreesCI newNode(int data) {
        NodeTreesCI temp = new NodeTreesCI();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    public static void main(String[] args) {
        NodeTreesCI root1 = newNode(1);
        root1.left = newNode(2);
        root1.right = newNode(3);
        root1.left.left = newNode(4);
        root1.left.right = newNode(5);
        // root1.right.right = newNode(6);

        NodeTreesCI root2 = newNode(1);
        root2.left = newNode(2);
        root2.right = newNode(3);
        root2.left.left = newNode(4);
        root2.left.right = newNode(5);
       // root2.right.right = newNode(6);

        if (areIdentical(root1, root2) == true)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
