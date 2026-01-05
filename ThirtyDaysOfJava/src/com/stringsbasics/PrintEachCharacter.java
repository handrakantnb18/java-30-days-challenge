package com.stringsbasics;

public class PrintEachCharacter {
    public static void main(String[] args) {
        String str = "Chandrakant bhosale";

        for (int i = 0; i < str.length(); i++) {
            System.out.println("Charactors : " + i + " = " + str.charAt(i));
        }
    }
}
