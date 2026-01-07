package com.esearchingsorting;

import java.util.Arrays;
import java.util.Collections;

public class KthLargestElement {

    public static int findKthLargest(Integer[] arr, int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        return arr[k - 1];
    }
    public static void main(String[] args) {
        Integer[] arr = {112, 5, 35, 78, 98, 29};
        int k = 3;

        System.out.println(findKthLargest(arr, k));
    }
}
