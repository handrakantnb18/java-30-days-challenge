package com.krecursion;

public class PalindromeCeck {
    public static boolean isPalindrom(String s) {
        s= s.toLowerCase();

        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        String s = "level";

        boolean res = isPalindrom(s);

        if (res) {
            System.out.println('"' + s + '"'+ "Is a paliandrom...");
        }else {
            System.out.println('"' + s + '"' + " is not paliandrom...");
        }
    }
}
