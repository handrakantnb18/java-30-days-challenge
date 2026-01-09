
package com.glinkedlistadvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static int[] removeDeplicates(int[] array) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for (int num : array) {
            lhs.add(num);
        }
        return lhs.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5, 5, 8, 8 ,7};
        int[] result = removeDeplicates(array);
        System.out.println(Arrays.toString(result));
    }
}
