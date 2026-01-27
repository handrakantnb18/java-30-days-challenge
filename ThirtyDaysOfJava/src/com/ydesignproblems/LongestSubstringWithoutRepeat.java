package com.ydesignproblems;

public class LongestSubstringWithoutRepeat {

    //string str, find the length of the longest substring without repeating characters.
    public static Boolean areDistict(String str, int i, int j) {
        boolean[] visited = new boolean[26];

        for (int k = i; k <= j; k++) {
            if (visited[str.charAt(k) - 'a'] == true)
                return false;

            visited[str.charAt(k) - 'a'] =true;
        }
        return true;
    }

    public static int longestUniqueSubsttr(String str) {
        int n = str.length();

        int res = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (areDistict(str, i, j))
                    res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "huidhfijheuidfhe";
        System.out.println("The input string is : "+str);

        int len = longestUniqueSubsttr(str);

        System.out.println("The length of the longest : "+ "non-repeating charactor " + "Substring is : " +len);
    }
}
