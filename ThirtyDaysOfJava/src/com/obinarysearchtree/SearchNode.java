package com.obinarysearchtree;

public class SearchNode {
    public static int search(int[] arr1, int arr2) {
        int num = arr1.length;

        for (int i = 0; i < num; i++) {
            if (arr1[i] == arr2)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};

        int x = 10;

        int result = search(arr, x);
        if (result == -1)
            System.out.println("not present in the arrray : ");
        else
            System.out.println("Elemeent is present  : "+ " at index " + result);
    }
}
