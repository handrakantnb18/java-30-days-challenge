
package com.esearchingsorting;

import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int pivot = arr[arr.length - 1];
        int[] left = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] right = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] equals = Arrays.stream(arr).filter(x -> x < pivot).toArray();

        left = quickSort(left);
        right = quickSort(right);

        return concatenate(left, equals, right);
    }
    public static int[] concatenate(int[] left, int[] equals, int[] right)
    {
        int[] result = new int[left.length + equals.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(equals, 0, result, left.length, equals.length);
        System.arraycopy(right, 0, result, left.length + equals.length, right.length);
        return result;
    }

    public static void main(String[] args) {
        int[] data = {10, 7, 20, 5, 78, 92};
        System.out.println("Unsorted Array : " +Arrays.toString(data));

        int[] sortedArray = quickSort(data);
        System.out.println("Sorted Array : " + Arrays.toString(sortedArray));
    }
}
