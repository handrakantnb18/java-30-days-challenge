package com.zafstringadvance;

public class LongestCommonPrefix {
    public static String findLongestCommonPrefix(String[] string)
    {
        if (string == null || string.length == 0)
            return  " ";

        String prefix = string[0];
        for (int i = 0; i < string.length; i++) {
            while (!string[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return " ";
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] string = { "flower", "flow", "flight"};
        System.out.println("Longest Common Profix : " + findLongestCommonPrefix(string));
    }
}
