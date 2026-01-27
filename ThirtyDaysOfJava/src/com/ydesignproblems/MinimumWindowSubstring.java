package com.ydesignproblems;

public class MinimumWindowSubstring {

    // function to check if s2 is a subsequence of s2

    static boolean isSubsequence(String sub, String s2) {
        int i = 0, j = 0;

        while (i < sub.length() && j < s2.length())
        {
            if (sub.charAt(i) == s2.charAt(j)) j++;
            i++;
        }
        return j == s2.length();
    }

    static String minWindow(String s1, String s2) {
        int n = s1.length();
        String ans = " ";

        int minLen = Integer.MAX_VALUE;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                String sub = s1.substring(start, end + 1);

                if (isSubsequence(sub, s2)) {
                    if (sub.length() < minLen) {
                        minLen = sub.length();
                        ans = sub;
                    }
                    break;
                }
            }
        }
        return ans;
    }


    // [Better Approach] Two-Pointer Forward Scan with Backtracking - O(n^2) Time and O(1) Space

    static String minWindow1(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        String ans = " ";
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int p1 = i, p2 = 0;

                while (p1 < n && p2 < m) {
                    if (s1.charAt(p1) == s2.charAt(p2)) p2++;
                    p1++;
                }

                if (p2 == m) {
                    int end = p2 - 1;
                    p2 = m - 1;

                    while (end >= i) {
                        if (s1.charAt(end) == s2.charAt(p2)) p2--;

                        if (p2 < 0)
                            break;
                        end--;
                    }

                    int start = end;
                    int len = p1 - start;

                    if (len < minLen) {
                        minLen = len;

                        ans = s1.substring(start, start + len);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        // function to check if s2 is a subsequence of s2
        String s1 = "abcdebdde";
        String s2 = "bde";
        System.out.println(minWindow(s1, s2));

        String s3 = "abcdebdde";
        String s4 = "bde";
        System.out.println(minWindow1(s3, s4));
    }
}
