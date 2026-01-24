package com.vmathnumberproblems;

public class CountDigits {

    static int countDigit(int n){
        if (n == 0)
            return 1;

        int count = 0;

        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    static int countDi(int m) {

        if (m / 10 == 0)
            return 1;

        return 1 + countDi(m / 10);
    }

    static int countDig(int a) {
        return (int)Math.floor(Math.log10(a) + 1);
    }

    static int counDigit(int b){
        String num = Long.toString(b);
        return num.length();
    }

    public static void main(String[] args) {

        int n = 58964;
        System.out.println(countDigit(n));

        int m = 444844;
        System.out.println(countDi(m));

        int a = 489899804;
        System.out.println(countDig(a));

        int b = 8789789;
        System.out.println(counDigit(b));

    }
}
