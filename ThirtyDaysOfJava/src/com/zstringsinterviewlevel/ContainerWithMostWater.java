package com.zstringsinterviewlevel;

public class ContainerWithMostWater {

    //  Checking all possible boundaries - O(n^2) Time and O(1) Space

    static int mostWater(int[] arr) {
        int n = arr.length;
        int res = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                int amount = Math.min(arr[i], arr[j] ) * (j - i);
                res = Math.max(amount, res);
            }
        }
        return res;
    }

    // Checking all possible boundaries - O(n^2) Time and O(1) Space
    static int containerWater(int[] arr1) {
        int n = arr1.length;
        int res1 = 0;
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                int amount1 =
                        Math.min(arr1[i], arr1[j]) * (j - i);
                res1 = Math.max(amount1, res1);
            }
        }
        return res1;
    }

    public static void main(String[] args) {
        //  Checking all possible boundaries - O(n^2) Time and O(1) Space
        int[] arr = {2, 1, 8, 6, 4, 6, 5, 5};
        System.out.println(mostWater(arr));

        // Checking all possible boundaries - O(n^2) Time and O(1) Space
        int[] arr1 = {2, 1, 8, 6, 4, 6, 5, 6};
        System.out.println(containerWater(arr1));
    }
}
