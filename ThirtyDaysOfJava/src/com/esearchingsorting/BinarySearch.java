
package com.esearchingsorting;

public class BinarySearch {
    static int binarySearch(int num1[], int num2, int num3, int num4)
    {
        while (num2 <= num3 ){
            int m = (num2 + num3) / 2;

            if (num1[m] == num4) {
                return m;
            }
            else if (num1[m] > num4){
                num3 = m - 1;
            }else {
                num2 = m + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = num1.length;
        int num4 = 10;

        int res = binarySearch(num1, 0, n -1, num4);

        System.out.println("Element Searched : "+ num4);

        if (res == -1)
            System.out.println("Element not present : ");
        else
            System.out.println("Element is present : " +res);
    }
}
