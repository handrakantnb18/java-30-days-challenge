package com.zstringsinterviewlevel;

public class StringScrambling {

    public static void main(String[] args) {

        // Use StringBuilder or StringBuffer for String Concatenation
        StringBuilder sb = new StringBuilder();
        sb.append("Chandrakant");
        sb.append(" Bhosale");
        sb.append(" ");
        sb.append(" Priyanka");
        String result = sb.toString();
        System.out.println(result);

        // Prefer StringBuilder over StringBuffer
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Priyanak ");
        stringBuilder.append(" ");
        stringBuilder.append(" Chandrakant");
        stringBuilder.append(" Bhosale");

        String result1 = stringBuilder.toString();

        System.out.println("String Builder : " +result1);

        // Utilize String Formatting
        String name = "Ram";
        int age = 30;
        String message =String.format("My name is %s and I am %d years old", name, age);

        // Use the equals() Method for String Comparison
        String str = "Hello, ";
        String str1 = " Chandrakant";
        String str2 = "Hello, ";
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.equalsIgnoreCase(str2));
    }
}
