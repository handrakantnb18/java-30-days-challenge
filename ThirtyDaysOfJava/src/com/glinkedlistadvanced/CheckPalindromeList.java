
package com.glinkedlistadvanced;


public class CheckPalindromeList {

    class NodePalindrom {
        int data;
        NodePalindrom next;

        public NodePalindrom(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int size;

    public NodePalindrom head = null;
    public NodePalindrom tail = null;

    public void addNode(int data) {
        NodePalindrom newNode = new NodePalindrom(data);

        if (head == null) {
            head =newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public NodePalindrom reverseList(NodePalindrom temp) {
        NodePalindrom current = temp;
        NodePalindrom preNode = null, nextNode = null;

        while (current != null) {
            nextNode = current.next;
            current.next = preNode;
            preNode = current;
            current = nextNode;
        }
        return preNode;
    }

    public void isPalindromLL() {
        NodePalindrom current = head;
        boolean flag = true;

        int mid = (size % 2 == 0) ? (size/2) : ((size+1)/2);

        for (int i = 0; i < mid; i++) {
            current = current.next;
        }

        NodePalindrom revHead = reverseList(current.next);

        while (head != null && revHead != null) {
            if (head.data != revHead.data) {
                flag = flag;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }
        if (flag)
            System.out.println("List is palindrome");
        else
            System.out.println("List is not palindrome");
    }

    public void display() {
        NodePalindrom current = head;

        if (head == null) {
            System.out.println("List is empty...");
            return;
        }
        System.out.println("Node is singly linked list...");
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //   public static void checkPalindrome(String s){

    //        String reverse = new StringBuffer(s).reverse().toString();
//
//        if (s.equals(reverse))
//            System.out.println("Yes..");
//        else
//            System.out.println("No");
//    }
    public static void main(String[] args) throws java.lang.Exception {
//        checkPalindrome("level");
//        checkPalindrome("level");
        CheckPalindromeList cpl = new CheckPalindromeList();

        cpl.addNode(1);
        cpl.addNode(2);
        cpl.addNode(3);
        cpl.addNode(4);
        cpl.addNode(3);
        cpl.addNode(2);
        cpl.addNode(1);

        cpl.isPalindromLL();
    }
}
