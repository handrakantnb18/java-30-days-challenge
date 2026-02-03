package com.zafstringadvance;

public class CheckSubstring {
    public static void main(String[] args) {
        String txt = "Hello, Chandraakkant";
        int num = txt.indexOf("Chandraakkant");

        if (num != -1) {
            System.out.println("SubString found .. : "+num);
        }else {
            System.out.println("Substring not found....");
        }
    }
}
