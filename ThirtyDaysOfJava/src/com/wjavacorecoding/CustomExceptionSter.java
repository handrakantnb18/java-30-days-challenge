package com.wjavacorecoding;

// Checked exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String m) {
        super(m);
    }
}

// UnChecked exception

class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String m) {
        super(m);
    }
}

public class CustomExceptionSter {

    // Checked exception
    public static void validate(int age)
        throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException ("Age must be 18 or above : ");
        }
        System.out.println("Valid age : " + age);
    }

    // UnChecked exception

    public static void divide(int a, int b) {
        if (b == 0) {
            throw new DivideByZeroException("Division by zero is not allowed.");
        }
        System.out.println(" Result : " + (a / b));
    }

    public static void main(String[] args) {

        // Checked exception
        try {
            validate(12);
        }catch (InvalidAgeException e) {
            System.out.println("Catch checked custom Exception : " +e.getMessage());
        }

        // UnChecked exception

        try {
            divide(10, 0);
        }catch (DivideByZeroException e) {
            System.out.println("Caught UnChecked coutom Exception : " +e.getMessage());
        }

    }
}
