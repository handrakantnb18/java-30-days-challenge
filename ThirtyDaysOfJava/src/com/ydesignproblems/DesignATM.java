package com.ydesignproblems;

public class DesignATM {

    public static void displayBalance(int balance) {
        System.out.println("Current Balance : " +balance);
    }

    public static int amountWithdrawing(int balance, int withdrawAmount) {
        System.out.println("\n Withdrawing Amount : " +withdrawAmount);

        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and card.");

            displayBalance(balance);
        }
        else {
            System.out.println("Sorry!, Insufficient funds.");
            System.out.println();
        }
        return balance;
    }

    public static int amountDepositing(int balance, int depositeAmount) {
        System.out.println("\n Deposite Amount : " + depositeAmount);
        balance = balance + depositeAmount;
        System.out.println("Deposit successfully.");
        displayBalance(balance);
        return balance;
    }

    public static void main(String[] args) {
        int balance = 100000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;

        displayBalance(balance);

        balance = amountWithdrawing(balance, withdrawAmount);

        balance = amountDepositing(balance, depositAmount);
    }

}
