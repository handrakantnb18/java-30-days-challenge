package com.xjava8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReference {

    // The print method is a static method which is used to print the names.
    public static void print(String s) {
        System.out.println(s);
    }

    // A static method reference is used to refer to a static method of a class.
    static void square(int n) {
        System.out.println(n * n);
    }

    // This type of method reference refers to an instance method of a specific object.
    void display(String msg) {
        System.out.println(msg);
    }

    // A constructor reference is used to create a new object using a functional interface.
    MethodReference() {
        System.out.println("Last MethodReference Object is created");
    }
    public static void main(String[] args) {

        MethodReference methodReference = new MethodReference();
        // The print method is a static method which is used to print the names.
        String[] names = {"Priyanka", "Chandrakant", "Bhosale", "Sangli", "Jath"};
        Arrays.stream(names).forEach(MethodReference::print);

        // A static method reference is used to refer to a static method of a class.
        List<Integer> list = Arrays.asList(2, 3, 4, 5);
        list.forEach(MethodReference::square);

        // This type of method reference refers to an instance method of a specific object.
        List<String> data = Arrays.asList("ABC", "EFG", "123", "456", "789");
        data.forEach(methodReference::display);

        //  Reference to an Instance Method of an Arbitrary Object
        List<String> lang = Arrays.asList(
                "priyanka", "Chandrakant", "bhosale", "Jath", "Pune"
        );

        lang.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // A constructor reference is used to create a new object using a functional interface.
        Supplier<MethodReference> supplier = MethodReference::new;
        supplier.get();


    }
}
