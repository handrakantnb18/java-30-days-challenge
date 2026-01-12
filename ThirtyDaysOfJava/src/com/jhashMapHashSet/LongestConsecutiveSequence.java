package com.jhashMapHashSet;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    static int longestConsecutiveSeq(int[] arr) {
        if (arr.length == 0)
            return 0;

        Arrays.sort(arr);

        int res = 1, cnt = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                continue;

            if (arr[i] == arr[i - 1] + 1 ) {
                cnt++;
            }
            else {
                cnt = 1;
            }
            res = Math.max(res, cnt);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 1, 4, 5, 6};
        System.out.println(longestConsecutiveSeq(arr));
    }
}
