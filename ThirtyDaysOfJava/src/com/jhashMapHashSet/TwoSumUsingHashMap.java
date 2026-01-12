package com.jhashMapHashSet;

import java.util.HashMap;

public class TwoSumUsingHashMap {
    public int[] twoSum(int[] num1, int num2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num1.length; i++) {
            int complement = num2 - num1[i];

            if (map.containsKey(complement)) {
                return new int[] {
                        map.get(complement), i
                };
            }
            map.put(num1[i], i);
        }
        return new int[] {

        };
    }

    public static void main(String[] args) {
        TwoSumUsingHashMap tm = new TwoSumUsingHashMap();

        int[] nums1 = {2, 7, 11, 15, 19, 22};
        int target1 = 9;
        int[] result2 = tm.twoSum(nums1, target1);
        System.out.println("Example 1 output : [ " +result2[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result3 = tm.twoSum(nums2, target2);
        System.out.println("Example 2 output : [ " +result3[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result4 = tm.twoSum(nums3, target3);
        System.out.println("Example 3 output : [ " +result4[1] + "]");

    }
}
