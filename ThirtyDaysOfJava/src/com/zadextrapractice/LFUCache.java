package com.zadextrapractice;

class Node2 {
    int key, value;
    int timeStamp, cnt;
    Node2 next2;

    Node2(int key, int val, int timeStamp) {
        this.key = key;
        this.value = val;
        this.cnt = 1;
        this.timeStamp = timeStamp;
        this.next2 = null;
    }
}

class LFUCache2 {
    int capacity;
    int curSize;
    int curTime;
    Node2 head2;

    LFUCache2(int capacity) {
        this.capacity = capacity;
        curSize = 0;
        curTime = 0;
        head2 = new Node2(-1, -1, -1);
    }

    int get(int key) {
        curTime++;
        Node2 temp2 = head2;

        while(temp2.next2 != null) {
            if(temp2.next2.key == key) {
                temp2.next2.cnt++;
                temp2.next2.timeStamp = curTime;
                return temp2.next2.value;
            }
            temp2 = temp2.next2;
        }
        return -1;
    }

    void put(int key, int value) {
        curTime++;
        if(capacity == 0)
            return;
        Node2 temp2 = head2;

        while(temp2.next2 != null) {
            if(temp2.next2.key == key) {
                temp2.next2.value = value;
                temp2.next2.cnt++;
                temp2.next2.timeStamp = curTime;
                return;
            }
            temp2 = temp2.next2;
        }

        if(curSize < capacity) {

            curSize++;
            temp2 = head2;

            while(temp2.next2 != null) {
                temp2 = temp2.next2;
            }
            temp2.next2 = new Node2(key, value, curTime);
            return;
        }

        else {
            int minCnt = Integer.MAX_VALUE;
            int minTime = Integer.MAX_VALUE;
            Node2 minNode = null;
            temp2 = head2;

            while(temp2.next2 != null) {
                if(temp2.next2.cnt < minCnt ||
                        (temp2.next2.cnt == minCnt &&
                                temp2.next2.timeStamp < minTime)) {
                    minCnt = temp2.next2.cnt;
                    minTime = temp2.next2.timeStamp;
                    minNode = temp2;
                }
                temp2 = temp2.next2;
            }
            minNode.next2 = minNode.next2.next2;

            temp2 = head2;
            while(temp2.next2 != null) {
                temp2 = temp2.next2;
            }
            temp2.next2 = new Node2(key, value, curTime);
        }
    }
}


public class LFUCache {
    public static void main(String[] args) {
        LFUCache2 cache = new LFUCache2(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.print(cache.get(1) + " ");
        cache.put(3, 3);
        System.out.print(cache.get(2) + " ");
        cache.put(4, 4);
        System.out.print(cache.get(3) + " ");
        System.out.print(cache.get(4) + " ");
        cache.put(5, 5);
    }
}
