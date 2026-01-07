
package com.esearchingsorting;

public class LinearSearch {

    static int search(int num1[], int num2, int num3) {
        for (int i = 0; i < num2; i++) {
            if (num1[i] == num3)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num1 = { 3, 4, 8, 7, 9, 6, 5, 7};
        int num2 = num1.length;

        int num3 = 6;

        int index = search(num1, num2, num3);

        if (index == -1)
            System.out.println("Element is not present : ");
        else
            System.out.println("Element Found : " +index);
    }
}
