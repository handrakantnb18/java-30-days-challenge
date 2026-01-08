package com.flinkedlist;

public class FindMiddleElement {

    public static void main(String[] args) {
        int[] num1 = {1, 4, 7, 8, 9, 5, 2};
        int[] num2 = {11, 15, 16, 18, 25, 29, 33, 35};

        printMiddle(num1);
        printMiddle(num2);
    }
    public static void printMiddle(int[] nums) {
        int n = nums.length;
        if (n == 0){
            System.out.println("Array is Empty...");
            return;
        }
        if (n % 2 == 0) {
            System.out.println("Hiddle Elements : " + nums[n / 2 - 1]+ " "+ nums[n / 2]);
        }else {
            System.out.println("Hiddle Elements : "+ nums[n / 2]);
        }
    }
}
