package com.barray.intermidiate;

public class RotateArraybyKPositions {

    public static void rotateK0(int[] arr, int num1) {
        int num = arr.length;
        if (num == 0) return;;

        num1 = num1 % num;
        int i, j;

        for (i = num - num1, j = num - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (i = 0, j = num - num1 - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        for (i =0, j = num -1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int num1 = 2;
        rotateK0(arr, num1);

        for (int it : arr) {
            System.out.println(it + " ");
        }
    }
}
