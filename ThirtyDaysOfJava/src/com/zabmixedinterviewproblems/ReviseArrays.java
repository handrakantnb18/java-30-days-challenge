package com.zabmixedinterviewproblems;


// An array of objects is created like an array of primitive-type data items

class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}


public class ReviseArrays {

        public static void main(String[] args) {
            // An array is a collection of elements of the same data type stored in contiguous memory locations.
            int[] arr = { 10, 20, 30, 40};
            int n = arr.length;
            System.out.println("Primary Array -> ");

            for (int i = 0; i < n; i++)
                System.out.println(arr[i]+ " ");

            System.out.println();

            String[] names = {"Chandrakant", "Priyanka", "Vijay"};

            System.out.println("Non-Primitive Array - > ");

            for (int i = 0; i < names.length; i++)
                System.out.println(names[i] + " ");

            // Elements of an array can be accessed by their position, called the index.

            int[] arr1 = { 2, 4, 8, 12, 16 };

            System.out.println(arr1[3] + " ");

            System.out.println(arr1[0]);

            // To update an element at a specific index in an array, use the assignment operator =
            int[] arr2 = { 2, 4, 8, 12, 16, 20 };

            arr2[0] = 90;
            System.out.println(arr2[0]);

            // Traversing an array means accessing each element one by one.

            int[] arr3 = { 3, 6, 9, 12, 15, 18 };

            for (int i = 0; i < arr.length; i++){
                System.out.println(arr3[i] + " ");
            }

            // The size of an array refers to the number of elements it can hold.

            int[] arr4 = { 5, 10, 15, 20, 25 };
            System.out.println(" Size of Array : " + arr4.length);

            // JVM throws ArrayIndexOutOfBoundsException to indicate that the array has been accessed with an illegal index.
            int[] arr5 = new int[4];
            arr5[0] = 10;
            arr5[1] = 20;
            arr5[2] = 30;
            arr5[3] = 40;

            System.out.println("Trying to access element outside the size of arrays.");

            System.out.println(arr5[3]);

            // An array of objects is created like an array of primitive-type data items
            Student[] arr6;
            arr6 = new Student[5];

            arr6[0] = new Student(1, "Chandrakant");
            arr6[1] = new Student(2, "Priyanka");
            arr6[2] = new Student(3, "Vijay");
            arr6[3] = new Student(4, "Vaibhav");
            arr6[4] = new Student(5, "Ram");

            for (int i = 0; i < arr6.length; i++) {
                System.out.println("Element at " + i + " : { "
                        + arr6[i].roll_no + " " + arr6[i].name+ " } ");
            }


        }

}
