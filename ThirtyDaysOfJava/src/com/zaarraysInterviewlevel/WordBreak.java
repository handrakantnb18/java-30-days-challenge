package com.zaarraysInterviewlevel;

import java.util.Arrays;

public class WordBreak {

    // Using Recursion - O(2^n) Time and O(n) Space
        static boolean wordbreakRec(int i, String s,String[] dectionary) {
            if (i == s.length())
                return true;

            String prefix = " ";

            for (int j = i; j < s.length(); j++) {
                prefix += s.charAt(j);

                if (Arrays.asList(dectionary).contains(prefix) &&
                wordbreakRec(j + 1, s, dectionary)) {
                    return true;
                }
            }
            return false;
        }

        static boolean wordBreak(String s, String[] dectionary)
        {
            return wordbreakRec(0, s, dectionary);
        }

        //Using Top-Down DP - O(n^2) Time and O(n+m) Space

        static boolean wordBreakR(int ind1, String s1, String[] dist1, int[] dp1) {
            if (ind1 >= s1.length()) {
                return true;
            }

            if (dp1[ind1] != -1) {
                return dp1[ind1] == 1;
            }

            boolean possible = false;

            for (String temp1 : dist1) {
                if (temp1.length() > s1.length() - ind1) {
                    continue;
                }
                boolean ok = true;
                int k = ind1;

                for (int j = 0; j < temp1.length(); j++) {
                    if (temp1.charAt(j) != s1.charAt(k)) {
                        ok = false;
                        break;
                    }
                    k++;
                }
                if (ok) {
                    possible |= wordBreakR(ind1 + temp1.length(), s1, dist1,dp1);

                }
            }
            dp1[ind1] = possible ? 1 : 0;
            return possible;
        }

        public static boolean wordBre(String s1, String[] dist1) {
            int n = s1.length();
            int[] dp1 = new int[n + 1];
            Arrays.fill(dp1, -1);
            return wordBreakR(0, s1, dist1, dp1);
        }

        // Using Bottom Up DP - O(n*m*k) time and O(n) space

    static boolean wordBrek(String s2, String[] derectory1) {
            int n = s2.length();
            boolean[] dp2 = new boolean[n + 1];
            dp2[0] = true;

            for (int i = 1; i <= n; i++) {
                for (String w : derectory1) {

                    int start = i - w.length();
                    if (start >= 0 && dp2[start] && s2.substring(start, start = s2.length())
                            .equals(w)) {
                        dp2[i] =true;
                        break;
                    }
                }
            }
            return dp2[n];
    }

    public static void main(String[] args) {
        // Using Recursion - O(2^n) Time and O(n) Space
        String s = "ilike";
        String[] dectionary = {"i", "like", "abc"};

        System.out.println(wordBreak(s, dectionary) ? "true" : "false");

        // Using Top-Down DP - O(n^2) Time and O(n+m) Space
            String s1 = "ilike";
            String[] dist1 = {"i", "like", "abc"};
        System.out.println(wordBre(s1, dist1) ? "true" : "false");

        // Using Bottom Up DP - O(n*m*k) time and O(n) space
        String s2 = "ilike";
        String[] dectionary1 = {"i", "like", "abc"};
        System.out.println(wordBrek(s1, dectionary1) ? "true" : "false");
    }
}
