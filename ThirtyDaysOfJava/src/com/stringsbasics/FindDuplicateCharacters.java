package com.stringsbasics;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String string = "ChandrakantPriyanka";
        int count = 0;

        char[] result = string.toCharArray();
        System.out.println("Duplicate charactors are : ");

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length(); j++ ) {
                if (result[i] == result[j]) {
                    System.out.print(result[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
