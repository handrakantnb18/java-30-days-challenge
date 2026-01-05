package com.stringsbasics;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "  Priyanka chandrakant bhosale";
        System.out.println("Before whitespace : "+str);

        String result = str.replaceAll("\\s", "");
        System.out.println("After whitespace ReplaceAll method : "+result);

        String result1 = str.trim();
        System.out.println("Trim method : "+result1);
    }
}

