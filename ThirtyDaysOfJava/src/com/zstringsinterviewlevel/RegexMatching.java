package com.zstringsinterviewlevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatching {

    public static void main(String[] args) {

        // The Matcher class performs matching operations for input strings.

        Pattern p = Pattern.compile("Chandr");
        Matcher m = p.matcher("Chandrakant.bho");

        while (m.find()) {
            System.out.println("Pattern found from : " +m.start()+ " to " + (m.end() - 1));
        }

        // The Pattern class compiles regex strings into pattern objects.

        System.out.println(Pattern.matches("Chandr.*", "Chandrakant"));

        System.out.println(Pattern.matches("Chandr[0-9]+","Chandr18s"));

        // Regex Character Classes
        System.out.println(Pattern.matches("[a-z]", "g"));

        System.out.println(Pattern.matches("[a-zA-Z]", "Chandr"));
    }
}
