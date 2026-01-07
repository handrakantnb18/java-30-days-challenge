
package com.esearchingsorting;

import java.util.Arrays;

public class MergeSort {

    public void mergerSort(int[] arr, int left, int right) {

        if (left < right) {
            int mid = left + (right - left ) / 2;
            mergerSort(arr, left, mid);
            mergerSort(arr, mid + 1, right);

            merge(arr, mid, left, right);
        }
    }

    public void merge(int[] arr, int mid, int left, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArray[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2){
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            }else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void printArray(int[] arr) {
        for (int value : arr)
            System.out.println(value + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {78, 2, 46, 5, 34, 9, 1};

        System.out.println("Origanal Array : ");
        ms.printArray(arr);

        ms.mergerSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array : ");

        ms.printArray(arr);
    }
}
