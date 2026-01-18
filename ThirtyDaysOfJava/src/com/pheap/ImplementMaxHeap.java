package com.pheap;

public class ImplementMaxHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    public ImplementMaxHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize];
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    private boolean isLEaf(int pos) {
        if (pos >= (size / 2) && pos < size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    private void maxHeapify(int pos) {
        if (isLEaf(pos))
            return;

        if (Heap[pos] < Heap[leftChild(pos)]
        || Heap[pos] < Heap[rightChild(pos)]) {

            if (Heap[leftChild(pos)]
            > Heap[rightChild(pos)]) {
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }
            else {
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

    public void insert(int element) {
        Heap[size] = element;

        int current = size;
        while (Heap[current] >
        Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
        size++;
    }

    public void print()
    {
        for (int i = 0; i < size / 2; i++) {
            System.out.println("Parent Node : " +Heap[i]);

            if (leftChild(i) < size)
                System.out.println("Left Child Node : " + Heap[leftChild(i)]);

            if (rightChild(i) < size)
                System.out.println("Right Child Node : " + Heap[rightChild(i)]);
            System.out.println();
        }
    }

    public int extractMax()
    {
        int popped = Heap[0];
        Heap[0] = Heap[--size];
        maxHeapify(0);
        return popped;
    }

    public static void main(String[] args) {
        System.out.println("The Max Heap is : ");

        ImplementMaxHeap imp = new ImplementMaxHeap(15);

        imp.insert(5);
        imp.insert(3);
        imp.insert(17);
        imp.insert(10);
        imp.insert(84);
        imp.insert(19);
        imp.insert(6);
        imp.insert(22);
        imp.insert(9);

        imp.print();

        //System.out.println("The max val is : " +implementMinHeap);
        System.out.println("The max val is "
                + imp.extractMax());
    }
}
