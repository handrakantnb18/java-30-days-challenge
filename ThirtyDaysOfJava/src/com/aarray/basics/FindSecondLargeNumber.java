package com.aarray.basics;

import java.util.*;

public class FindSecondLargeNumber {

    public static void main(String[] args) {
        int[] nums = {12, 15, 78, 65, 98, 99, 102};

        int largest = Integer.MIN_VALUE;

        for(int num : nums) {
            if (num > largest) {
                largest = num;
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second Largest Number : " + secondLargest);
    }
}
