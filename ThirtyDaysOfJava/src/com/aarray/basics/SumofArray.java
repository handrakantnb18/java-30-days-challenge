package com.aarray.basics;

public class SumofArray {

    static int num[] = {12, 56, 78, 25, 48, 92, 90, 4};

    static int sum()
    {
        int sum = 0;
        int i;

        for(i = 0; i< num.length; i++)
            sum += num[i];

        return sum;
    }
    public static void main(String[] args) {

        System.out.println("Summ of Array : "+sum());
    }
}
