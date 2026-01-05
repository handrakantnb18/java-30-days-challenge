package com.stringsbasics;

public class ReverseaString {
    public static void main(String[] args) {
        String str = "ChandrakantBhosale";
        String reversed = "";

        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
        }
        System.out.println(reversed);
    }
}
