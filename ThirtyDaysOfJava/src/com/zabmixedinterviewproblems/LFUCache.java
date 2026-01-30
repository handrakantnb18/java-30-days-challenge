package com.zabmixedinterviewproblems;


class NodeLFU {
    int key, value;
    int timeStamp, cnt;

    NodeLFU(int key, int val, int timeStamp) {
        this.key = key;
        this.value = val;
        this.cnt = 1;
        this.timeStamp = timeStamp;
    }
}

class LFUCache1 {
    int capacity;
    int curSize;
    int curTime;
    NodeLFU[] cacheList;

    LFUCache1(int capacity) {
        this.capacity = capacity;
        curSize = 0;
        curTime = 0;
        cacheList = new NodeLFU[capacity];
    }
    int get(int key) {
        curTime++;

        for (int i = 0; i < capacity; i++) {
            if (cacheList[i] != null && cacheList[i].key == key) {
                cacheList[i].cnt++;
                cacheList[i].timeStamp = curTime;
                return cacheList[i].value;
            }
        }
        return -1;
    }

    void put(int key, int value) {
        curTime++;
        if (capacity == 0)
            return;

        for (int i = 0; i < capacity; i++) {
            if (cacheList[i] != null && cacheList[i].key == key) {
                cacheList[i].value = value;
                cacheList[i].cnt++;
                cacheList[i].timeStamp = curTime;
                return;
            }
        }

        if (curSize < capacity) {
            curSize++;
            for (int i = 0; i < capacity; i++)
            {
                if (cacheList[i] == null) {
                    cacheList[i] = new NodeLFU(key, value, curTime);
                    return;
                }
            }
        }
        else {
            int minCnt = Integer.MAX_VALUE;
            int minTime = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int i = 0; i < capacity; i++) {
                if (cacheList[i].cnt < minCnt && cacheList[i].timeStamp < minTime) {
                    minCnt = cacheList[i].cnt;
                    minTime = cacheList[i].timeStamp;
                    minIndex = i;
                }
            }
            cacheList[minIndex] = new NodeLFU(key,value, curTime);
        }
    }
}

public class LFUCache {

    public static void main(String[] args) {
        LFUCache1 cache = new LFUCache1(2);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1) + " ");

        cache.put(3, 3);
        System.out.println(cache.get(2)+ " ");

        cache.put(4, 4);
        System.out.println(cache.get(3)+ " ");
        System.out.println(cache.get(4) + " ");
        cache.put(5, 5);
    }
}
