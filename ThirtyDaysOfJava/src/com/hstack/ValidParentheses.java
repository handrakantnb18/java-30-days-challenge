package com.hstack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isBalanced(String str)
    {
        Stack<Character> sc = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                sc.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (str.isEmpty())
                    return false;
                char top = sc.peek();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
                sc.pop();
            }
        }
        return sc.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[()()]{}";
        System.out.println((isBalanced(str) ? "true" : "False"));
        System.out.println();
    }
}
