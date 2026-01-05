package com.stringsbasics;

import java.util.Locale;

public class ConvertStringToUppercase {
    public static void main(String[] args) {
        String str1 = "Hello, Chandrakant bhosale How are you";
        String str2 = "HELLO, CHANDRAKANT BHOSALE, HOW ARE YOU RIGHT KNOW";

        String result = str1.toUpperCase(Locale.ROOT);
        System.out.println(result);

        String result2 = str2.toLowerCase(Locale.ROOT);
        System.out.println(result2);
    }
}
