
package com.dstringsadvanced;

public class StringRotationCheck {
    public static boolean areRotation(String s1, String s2) {
        return  s1.length() == s2.length() && (s1 + s2).contains(s2);
    }
    public static void main(String[] args) {
        String s1 = "CHANDR";
        String s2 = "RDNAHC";

        if (areRotation(s1, s2)) {
            System.out.println("\""+ s2 + "\" is a rotation of \""+ s1 +"\".");
        }else {
            System.out.println("\""+ s2 + "\" is a rotation of \""+ s1 +"\".");
        }
    }
}

