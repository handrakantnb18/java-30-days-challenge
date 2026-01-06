package com.dstringsadvanced;

public class LongestPalindromeSubstring {
    static void subStr (String str1, int num1, int num2) {
        System.out.println(str1.substring(num1, num2 + 1));
    }

    static int longPalSubstr(String str1) {
        int n = str1.length();
        boolean table[][] = new boolean[n][n];
        int mLength = 1;

        for (int i = 0; i < n; ++i){
            table[i][i] = true;

            int strt = 0;

            for (int a = 0; a < n - 1; ++a){
                if (str1.charAt(i) == str1.charAt(a + 1)){
                    table[a][a + 1] =true;
                    strt =a;
                    mLength= 2;
                }
            }
            for (int k = 3; k <= n; ++k){
                for (int b = 0; b <n - k + 1; ++b) {
                    int j = b + k - 1;
                    if (table[b + 1][j - 1] && str1.charAt(b) == str1.charAt(j)) {
                        table[b][j] = true;

                        if (k > mLength) {
                            strt = b;
                            mLength = k;
                        }
                    }
                }
            }
            System.out.println("Longest Palindrom is : ");
            subStr(str1, strt, strt + mLength - 1);

        }
        return mLength;
    }

    public static void main(String[] args) {
        String str1 = "jjjhnfkjdffvfvuvv";
        System.out.println("The given string are : " + str1);
    }
}
