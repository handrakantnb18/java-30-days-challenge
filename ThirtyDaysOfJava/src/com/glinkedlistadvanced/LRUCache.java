package com.glinkedlistadvanced;

public class LRUCache {

    private final int capacity;
    private final Map<Integer, NodeLRU> cache;
    private final DoublyLinkedList order;

    class NodeLRU {
        int key, value;
        NodeLRU prev, next;
        NodeLRU(int k, int v){
            key = k;
            value = v;
        }

        class DoublyLinkedList {
            NodeLRU head, tail;
            DoublyLinkedList() {
                head = new NodeLRU(-1, 1);
                tail = new NodeLRU(-1, 1);
                head.prev = tail;
                tail.prev = head;
            }

            void addFirst(NodeLRU nodeLRU) {
                nodeLRU.next = head.next;
                nodeLRU.prev = head;
                head.next.prev = nodeLRU;
                head.next = nodeLRU;
            }
            void remove(NodeLRU nodeLRU){
                nodeLRU.prev.next = nodeLRU.next;
                nodeLRU.next.prev = nodeLRU.prev;
            }

        }
        public LRUCache(int capacity) {

        }
    }
    public static void main(String[] args) {

    }
}
