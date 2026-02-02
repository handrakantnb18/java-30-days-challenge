package com.zaebarrayintermidiate;

public class MajorityElement {
    public static int findMajorityElement(int[] nums) {
        int count = 1;
        int majorityElement = nums[0];

        for (int i = 1; i <nums.length; i++) {
            if (nums[i] == majorityElement)
                count++;
            else
                count--;

            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            }
        }

        return majorityElement;
    }
    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 8, 4, 4, 4};
        int majorityElement = findMajorityElement(nums);
        System.out.println("Majority Element : "+majorityElement);

    }
}
