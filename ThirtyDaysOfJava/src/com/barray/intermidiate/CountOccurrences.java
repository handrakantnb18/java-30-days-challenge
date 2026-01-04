
package com.barray.intermidiate;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] array = {9, 2, 5, 7, 2, 8, 6, 4, 2};
        int num1 = 2;

        int result = 0;
        for (int num : array) {
            if (num == num1) {
                result++;
            }
        }
        System.out.println("Element "+ num1 + " occurse "+ result + " times in the array");
    }
}
