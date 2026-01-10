package com.hstack;

import java.util.Stack;

public class EvaluatePostfixExpression {

    static int floorDiv(int a, int b) {
        if (a * b < 0 && a % b != 0)
            return (a / b) -1;
        return a / b;
    }

    public static int evaluatePostfix(String[] arr) {
        Stack<Integer> st = new Stack<>();

        for (String token : arr) {
            if (Character.isDigit(token.charAt(0)) ||
                    (token.length() > 1 && token.charAt(0) == '-')) {
                st.push(Integer.parseInt(token));
            }
            else {
                int value1 = st.pop();
                int value2 = st.pop();

                if (token.equals("+")) st.push(value1 + value2);
                else if (token.equals("-")) st.push(value1 - value2);
                else if (token.equals("/")) st.push(value1 / value2);
                else if (token.equals("*")) st.push(value1 * value2);

                else if (token.equals("^")) st.push((int)Math.pow(value2, value1));
            }
        }
        return st.pop();
    }
    public static void main(String[] args) {
        String[] str = {"1", "2","3", "4","5","6"};
        System.out.println(evaluatePostfix(str));

    }
}
