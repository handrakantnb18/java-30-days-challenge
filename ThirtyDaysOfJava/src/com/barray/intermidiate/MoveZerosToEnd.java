package com.barray.intermidiate;

public class MoveZerosToEnd {
    public static void moveZerotoEnd(int[] array) {
        int index = 0;

        for (int num : array) {
            if (num != 0) {
                array[index++] = num;
            }
        }
        while (index < array.length) {
            array[index++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] array = {1, 5, 0, 8, 7, 6, 0, 4, 0};
        moveZerotoEnd(array);

        for (int num : array) {
            System.out.println(num + " ");
        }
        }

    }
