package com.stringsbasics;

public class CompareTwoStrings {
    public static void main(String[] args) {
        String string1 = "Chandrakant";
        String string2 = "Chandrakant";
        String string3 = new String("Chandrakant");
        String string4 = "Chandrakant";

        //equals() method
        System.out.println("String1 and String2 : "+ string1.equals(string2));
        System.out.println("String1 and String4 : " + string1.equals(string4));

        // equalsIgnoreCase()
        System.out.println("String1 and string4 : "+ string1.equalsIgnoreCase(string4));

        // compareTo methods

        System.out.println("String1 and String3 : " + string1.compareTo(string3));
        System.out.println("String1 and string4 : " + string1.compareTo(string4));
        System.out.println("String1 and string2 : " + string1.compareTo(string2));

        // == operator

        System.out.println("String1 and string3 : " + string1 == string3);
        System.out.println("String2 and string4 : " + string2 == string4);

        // === operator

        // System.out.println("String1 and string3 : " + string1 === string3);
        // System.out.println("String2 and string4 : " + string2 === string4);

    }
}
