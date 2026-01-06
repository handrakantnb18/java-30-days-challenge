package com.dstringsadvanced;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String string = "chandrakantBhosale";
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }
        System.out.println("Duplicate Removes : " +result);
    }
}
