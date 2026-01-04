
package com.barray.intermidiate;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void remove(int[] arr) {
        LinkedHashSet<Integer> ls = new LinkedHashSet();

        for(int i = 0; i < arr.length; ++i) {
            ls.add(arr[i]);
        }

        System.out.println(ls);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{22, 33, 88, 22, 33, 44, 66, 55, 44};
        remove(arr);
    }
}
