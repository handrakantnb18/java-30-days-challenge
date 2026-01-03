package com.aarray.basics;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 10, 10, 50, 50, 80, 79, 25, 25};

        for(int i = 0; i < nums.length; i++) {
            for (int j = i = 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate Numbers : " + nums[i]);
                }
            }
        }
    }
}
