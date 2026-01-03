package com.aarray.basics;

import java.util.Arrays;

public class LefTrotateArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 56, 58, 73};
        int shiftCount = 1;
        System.out.println("Origanal Numbers : " + Arrays.toString(array));

        leftShift (array, shiftCount);
        System.out.println("Arrays after of left shift : " + Arrays.toString(array));
    }

    public static void leftShift(int[] array, int shiftCount) {
        int a = array.length;
        shiftCount %= a;
        int[] temp = new int[shiftCount];

        System.arraycopy(array, 0, temp, 0, shiftCount);
        System.arraycopy(array, shiftCount, array, 0, a - shiftCount);
        System.arraycopy(temp, 0, array, a - shiftCount, shiftCount);
    }
}
