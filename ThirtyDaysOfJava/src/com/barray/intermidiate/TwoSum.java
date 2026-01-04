package com.barray.intermidiate;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr1 =  {10, 20, 25};
        int[] arr2 = {5, 15, 30, 60};
        int maxLength = Math.max(arr1.length, arr2.length);
        int[] sumArray = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int value1 = (i < arr1.length) ? arr1[i] : 0;
            int value2 = (i < arr2.length) ? arr2[i] : 0;
            sumArray[i] = value1 + value2;
        }

        for (int num : sumArray) {
            System.out.println(num + " ");
        }
    }
}
