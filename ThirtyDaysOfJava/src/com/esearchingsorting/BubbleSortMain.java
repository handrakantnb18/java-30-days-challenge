package com.esearchingsorting;

public class BubbleSortMain {

    public static void main(String[] args) {

        int[] arr = {64, 89, 78, 25, 23, 45, 24, 91, 93, 29};

        bubbleShor(arr);

        System.out.println("Sorted array : ");
        for (int num : arr) {
            System.out.println(num+ " ");
        }
    }

    public static void bubbleShor(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
