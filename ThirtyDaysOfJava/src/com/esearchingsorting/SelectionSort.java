package com.esearchingsorting;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr ) {
            System.out.println(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] numbers = {12, 34, 45, 23, 56, 67, 78, 11, 89};
        System.out.println("Array : ");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted Array : ");
        printArray(numbers);
    }
}
