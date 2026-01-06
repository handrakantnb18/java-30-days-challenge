
package com.dstringsadvanced;

public class CountWords {
    public static void main(String[] args) {

        String string = "Chandrakant bhosale Pune software developer";
        if (string == null || string.trim().isEmpty()) {
            System.out.println(0);
        }else {
            String[] str = string.trim().split("\\s+");
            System.out.println("Number of words : " +str.length);
        }
    }
}
