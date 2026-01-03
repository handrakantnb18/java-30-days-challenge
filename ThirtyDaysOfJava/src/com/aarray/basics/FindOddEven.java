package com.aarray.basics;

public class FindOddEven {
    public static void main(String[] args) {
        int [] num = {5, 80, 90, 75, 56, 35, 48, 73, 29, 19};

        int checkOdd = 0, checkEven = 0;

        for(int num1: num ){
            if(num1 % 2 == 0) {
                checkEven++;
            }else {
                checkOdd++;
            }
        }

        System.out.println("Even Numbers : "+checkEven);
        System.out.println("Odd Number : "+checkOdd);
    }
}
