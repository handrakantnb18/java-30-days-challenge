
package com.dstringsadvanced;

public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty()){
            return str;
        }
        StringBuilder compress = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            }else {
                compress.append(str.charAt(i - 1)).append(count);
            }
        }
        compress.append(str.charAt(str.length() - 1)).append(count);

        return compress.length() < str.length() ? compress.toString() : str;
    }
    public static void main(String[] args) {
        String str = "AAAAAAABBBBZZZZZ";
        System.out.println("String Compressed : " + compress(str));
    }
}
