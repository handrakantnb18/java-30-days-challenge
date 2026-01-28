package com.zstringsinterviewlevel;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicateNumber {

    // Using Nested Loop - O(n2) Time and O(1) Space
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;

            for (int it : ans) {
                if (arr[i] == it) {
                    cnt++;
                    break;
                }
            }

            if (cnt > 0)
                continue;

            for (int j = i+ 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                    break;
                }
            }
            if (cnt > 0)
                ans.add(arr[i]);
        }
        return ans;
    }

    // Sorting with Consecutive Comparison - O(n × log n) Time and O(1) Space
    static ArrayList<Integer> findDupli(int[] arr1) {
        Arrays.stream(arr1);

        ArrayList<Integer> ans1 = new ArrayList<>();

        for (int i = 1; i < arr1.length; i++)
        {
            if (arr1[i] == arr1[i - 1])
            {
                if (ans1.isEmpty() ||
                ans1.get(ans1.size() - 1) != arr1[i])
                {
                    ans1.add(arr1[i]);
                }
            }
        }
        return ans1;
    }

    public static void main(String[] args) {
        // Using Nested Loop - O(n2) Time and O(1) Space
            int[] arr = {2, 3, 1, 2, 3};
            ArrayList<Integer> res = findDuplicates(arr);
            for (int ele : res){
                System.out.println(ele + " ");
            }
        System.out.println();

            // Sorting with Consecutive Comparison - O(n × log n) Time and O(1) Space
                int[] arr1 = {2, 3, 1, 2, 3};
                ArrayList<Integer> res1 = findDupli(arr1);

                for (int ele1 : res1) {
                    System.out.println(ele1 + " ");
                }
        System.out.println();
    }

}
