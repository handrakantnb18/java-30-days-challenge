package com.dstringsadvanced;

public class ReverseWordsinSentence {
    public static void main(String[] args) {
        String str[] = "how are you chandrakant bhosale, are  you good".split(" ");

        String answer = " ";
        for (int i = str.length -1; i >= 0; i--)
        {
            answer += str[i] + " ";
        }
        System.out.println("Reversed String : ");
        System.out.println(answer.substring(0, answer.length() - 1));

    }
}
