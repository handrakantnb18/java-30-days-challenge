package com.barray.intermidiate;

public class MergeTwoSortedArrays {
    public static int[] merge(int[] array1, int[] array2) {
        int n = array1.length, m = array2.length;
        int[] merged = new int[n+m];
        int i =0, j = 0, k = 0;

        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                merged[k++] = array1[i++];
            }else {
                merged[k++] = array2[j++];
            }
        }
        while (i < n) {
            merged[k++] = array1[i++];
        }
        while (j < m) {
            merged[k++] = array2[j++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] array1 = {7, 9, 5, 3, 1};
        int[] array2 = {8, 6, 4, 2, 10};
        int[] result = merge(array1, array2);

        System.out.println("Merged Array: ");
        for (int num : result) {
            System.out.println(num+ " ");
        }

    }
}
