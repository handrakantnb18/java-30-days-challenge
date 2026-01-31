package com.zacmockinterviewcoding;

import java.util.HashSet;

class NodePattern {
    int data;
    NodePattern next;

    NodePattern(int x) {
        this.data = x;
        this.next = null;
    }
}

// t that point, the difference in steps between fast and slow increases by 1 each turn
class NodePointer {
    int data1;
    NodePointer next1;

    public NodePointer(int x1) {
        this.data1 = x1;
        this.next1 = null;
    }
}

public class FastSlowPointersPattern {
    // The idea is to insert the nodes in the Hashset while traversing and whenever a node is encountered that is already present in the hashset

    static boolean detectLoop(NodePattern head) {
        HashSet<NodePattern> st = new HashSet<>();

        while (head != null) {
            if (st.contains(head))
                return true;

            st.add(head);
            head = head.next;
        }
        return false;
    }

    // t that point, the difference in steps between fast and slow increases by 1 each turn
    static boolean detectLoop1(NodePointer head1) {
        NodePointer slow = head1, fast = head1;

        while (slow != null && fast != null & fast.next1 != null)
        {
            slow = slow.next1;
            fast = fast.next1.next1;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // The idea is to insert the nodes in the Hashset while traversing and whenever a node is encountered that is already present in the hashset

        NodePattern head = new NodePattern(1);
        head.next = new NodePattern(3);
        head.next.next = new NodePattern(4);

        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("True");
        else
            System.out.println("false");

        // t that point, the difference in steps between fast and slow increases by 1 each turn
            NodePointer head1 = new NodePointer(1);
            head1.next1 = new NodePointer(3);
            head1.next1.next1 = new NodePointer(4);

            head1.next1.next1.next1 = head1.next1;

            if (detectLoop1(head1))
                System.out.println("True");
            else
                System.out.println("false");
    }
}
