package com.ydesignproblems;


import java.util.ArrayList;

class RabinKarpHash {
    private final int mod = 1000000007;
    private final int base = 31;
    private int[] hash;
    private int[] power;

    private int add(int a, int b) {
        a += b;
        if (a >= mod) a -= mod;
        return a;
    }

    private int sub(int a, int b) {
        a -= b;
        if (a < 0) a += mod;
        return a;
    }

    private int mul(int a, int b) {
        return (int)((1L * a * b) % mod);
    }

    private int charToInt(char c) {
        return c - 'a' + 1;
    }

    public RabinKarpHash(String s) {
        int n = s.length();
        hash = new int[n];
        power = new int[n];

        hash[0] = charToInt(s.charAt(0));
        power[0] = 1;

        for (int i = 1; i < n; ++i) {
            hash[i] = add(mul(hash[i - 1], base), charToInt(s.charAt(i)));
            power[i] = mul(power[i - 1], base);
        }
    }

    public int getSubHash(int l, int r) {
        int h = hash[r];
        if (l > 0) {
            h = sub(h, mul(hash[l - 1], power[r - l + 1]));
        }
        return h;
    }
}

public class RabinKarp {

    public static ArrayList<Integer> searchPattern(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        RabinKarpHash textHash = new RabinKarpHash(text);
        RabinKarpHash patHash = new RabinKarpHash(pattern);

        int patternHash = patHash.getSubHash(0, m - 1);
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            int subHash = textHash.getSubHash(i, i + m - 1);
            if (subHash == patternHash) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "geek";

        ArrayList<Integer> positions = searchPattern(txt, pat);
        for (int idx : positions) {
            System.out.print(idx + " ");
        }
        System.out.println();
    }

}
