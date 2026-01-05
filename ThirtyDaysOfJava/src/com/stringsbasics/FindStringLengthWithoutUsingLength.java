package com.stringsbasics;

public class FindStringLengthWithoutUsingLength {

    public static void main(String[] args) {
        String string = "welcome to java code with 30 days challenge";

        System.out.println("Length of World : " +getLengthOfStringWithChar(string));
    }
    public static int getLengthOfStringWithChar(String str)
    {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c:strCharArray)
        {
            length++;
        }
        return length;
    }
}
