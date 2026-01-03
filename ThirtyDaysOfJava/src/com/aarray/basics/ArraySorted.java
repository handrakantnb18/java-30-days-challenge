package com.aarray.basics;

public class ArraySorted {

    static boolean isSorted(int arr[], int n) {

        if(n == 1 || n == 0)
            return true;

        return arr[n - 1] >= arr[n - 2] && isSorted(arr, n - 1);
    }
    static boolean isSort(int arr[]) {
        return isSorted(arr, arr.length);
    }
    public static void main(String[] args) {

        int arr[] = {10, 15, 33, 45, 58, 78, 49};
        int n = arr.length;

        if(isSort(arr))
            System.out.println("true");
        else
            System.out.println("False");
    }
}
