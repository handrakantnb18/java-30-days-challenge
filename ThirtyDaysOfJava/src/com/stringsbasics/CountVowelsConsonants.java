package com.stringsbasics;

public class CountVowelsConsonants {
    public static void count(String str) {
        int vow = 0;
        int con = 0;

        String ref = "ChandrakantBhosaleP";

        for (int i = 0; i < str.length(); i++) {
            if (
                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            ) {
                if (ref.indexOf(str.charAt(i)) != -1)
                    vow++;
                else
                    con++;
            }
        }

        System.out.println("Number of Vowels : " +vow);
        System.out.println("Number of Conns : "+con);
    }
    public static void main(String[] args) {
        String str = "PriyankaBhosaleC";
        count(str);
    }
}
