package com.hstack;

import java.util.Scanner;
import java.util.Stack;

public class InfixtoPostfix {

    public static String infixToPostFix(String infix) {
        StringBuilder postfix = new StringBuilder();

        Stack<Character> str = new Stack<>();
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
            }
            else if (c == '(') {
                str.push(c);

            }
            else if (c == ')') {
                while (!str.isEmpty() && str.peek() != '(') {
                    postfix.append(str.pop());
                }
                str.pop();
            }
            else {

                while (!str.isEmpty() && predcedence(str.peek()) >= predcedence(c)) {
                    postfix.append(str.pop());
                }
                str.push(c);
            }
        }

        while (!str.isEmpty()) {
            postfix.append(str.pop());
        }
        return postfix.toString();
    }

    public static int predcedence(char operator) {
        switch (operator) {
            case '+' :
            case '-' :
                    return 1;
            case  '*' :
            case '/' :
                return 2;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Infix expression : ");
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();

        sc.close();
        String postfix = infixToPostFix(infix);

        System.out.println("Profix Expression is : \n " + postfix);
    }
}
