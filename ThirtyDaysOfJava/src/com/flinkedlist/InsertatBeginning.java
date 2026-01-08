package com.flinkedlist;

public class InsertatBeginning {

    public static void main(String[] args) {
        String str1 = "Chandrakant ";
        String str2 = "Priyanka ";

        char[] chars = new char[str1.length() + str2.length()];
        for (int i = 0; i < str2.length(); i++)
        {
            chars[i] = str2.charAt(i);
        }
        for (int i = str2.length(); i < chars.length; i++) {
            chars[i] = str1.charAt(i - str2.length());
        }
        System.out.println("String after inserting : " + new String(chars));
    }
}
