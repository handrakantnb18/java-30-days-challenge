package com.stringsbasics;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Chandrakant";
        String str1 = "level";
        boolean isPalindrome = true;
        boolean isaPalindrome = true;

        for (int i =0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome number");
        }else {
            System.out.println(str + "is not palindrome number");
        }

        for (int i =0; i < str1.length(); i++) {
            if (str1.charAt(i) != str1.charAt(str1.length() - 1 - i)) {
                isaPalindrome = false;
                break;
            }
        }
        if (isaPalindrome) {
            System.out.println(str1 + " is a palindrome number");
        }else {
            System.out.println(str1 + "is not palindrome number");
        }
    }
}
