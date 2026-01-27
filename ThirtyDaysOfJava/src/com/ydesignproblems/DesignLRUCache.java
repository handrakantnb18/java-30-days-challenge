package com.ydesignproblems;

import java.util.HashMap;
import java.util.Map;

class NodeLRU {
    int key;
    int value;
    NodeLRU next;
    NodeLRU prev;

    NodeLRU(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}

class LRUCccheDesign {
    private int capacity;
    private Map<Integer, NodeLRU> cacheMap;
    private NodeLRU head;
    private NodeLRU tail;

    LRUCccheDesign(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.head = new NodeLRU(-1, -1);
        this.tail = new NodeLRU(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;
        }

        NodeLRU nodeLRU = cacheMap.get(key);
        remove(nodeLRU);
        add(nodeLRU);
        return  nodeLRU.value;
    }

    void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            NodeLRU oldNode = cacheMap.get(key);
            remove(oldNode);
        }

        NodeLRU nodeLRU = new NodeLRU(key, value);
        cacheMap.put(key, nodeLRU);
        add(nodeLRU);

        if (cacheMap.size() > capacity) {
            NodeLRU nodeToDelete = tail.prev;
            remove(nodeToDelete);
            cacheMap.remove(nodeToDelete.key);
        }
    }

    private void add(NodeLRU nodeLRU) {
        NodeLRU nextNode = head.next;
        head.next = nodeLRU;
        nodeLRU.prev = head;
        nodeLRU.next = nextNode;
        nextNode.prev = nodeLRU;
    }

    private void remove(NodeLRU nodeLRU) {
        NodeLRU prevNode = nodeLRU.prev;
        NodeLRU nextNode = nodeLRU.next;
        prevNode.next = nextNode;
        nextNode.prev = nodeLRU;
    }
}
public class DesignLRUCache {
    public static void main(String[] args) {
        LRUCccheDesign cache = new LRUCccheDesign(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);
        System.out.println(cache.get(2));
        cache.put(4, 4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
