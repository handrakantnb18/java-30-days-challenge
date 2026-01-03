package com.aarray.basics;

import java.util.Arrays;

public class ReightRotateArray {
    public static void main(String[] args) {
        int[] nums = {20, 56, 80, 47, 36, 96, 23, 28};
        int shiftCount = 1;
        System.out.println("Origanal arrays : " + Arrays.toString(nums));

        rightShift(nums, shiftCount);
        System.out.println("Right Rotate arrays : " + Arrays.toString(nums));
    }
    public static void rightShift(int[] array, int shiftCount){
        int a = array.length;
        shiftCount %= a;
        int[] temp = new int[shiftCount];
        System.arraycopy(array, 0, temp, 0, shiftCount);
        System.arraycopy(temp, 0, array, a - shiftCount, shiftCount);
        System.arraycopy(array, shiftCount, array, 0, a - shiftCount);
    }
}
