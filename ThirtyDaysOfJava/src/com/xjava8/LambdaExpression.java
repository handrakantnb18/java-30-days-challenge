package com.xjava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Add {
    int addition(int a, int b);
}

// A functional interface has exactly one abstract method.

interface FunctionFace {
    void abstractFun(int x);
    default void normalFun() {
        System.out.println("Hello, Chandraknt");
    }
}

// Lambda with Zero Parameters

interface ZeroParameter {
    void  display();
}

// Lambda Expression with Multiple Parameters

@FunctionalInterface
interface  Functional {
    int operation(int a, int b);
}


public class LambdaExpression {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;

        int result = add.addition(20, 50);
        System.out.println("Result of addition : " +result);

        // A functional interface has exactly one abstract method.

        FunctionFace foj = (int x) ->
                System.out.println(2 * x);
        System.out.print("Addition of two numbers : ");
        foj.abstractFun(5);

        // Lambda with Zero Parameters
        ZeroParameter zp = () ->
                System.out.println("The zero parameters in lambda Expressions  ");

        zp.display();

        // It is not mandatory to use parentheses if the type of that variable can be inferred from the context.

        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);

        System.out.println("All Elements : ");
        list.forEach(n -> System.out.println(n));

        System.out.println("Even Elements : ");
        list.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });


        // Lambda Expression with Multiple Parameters

        Functional add1 = (a, b) -> a + b;
        Functional multiply = (a, b) -> a * b;

        System.out.println("Check Addition and Multiplication : ");
        System.out.println(add1.operation(40, 5));
        System.out.println(multiply.operation(5, 6));


        // Lambda expressions are widely used with Java Collections and Streams for concise operations

        List<String> names = Arrays.asList(
                "Chandrakant", "Priyanka", "Vijay", "Ram", "Shyam"
        );

        System.out.println("All Names : ");
        names.forEach(name -> System.out.println(names));

        System.out.println("\n Name starting with 'A' : ");
        names.stream().filter(
                n -> n.startsWith("A"))
                .map(n -> n.toLowerCase())
                .forEach(System.out::println);


    }
}
