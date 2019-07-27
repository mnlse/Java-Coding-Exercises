package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        for(int i=8; i>1; i--) {
            System.out.println("Interest at interest rate " + (double) i + " and amount 10000 is " + calculateInterest(10000, i));
        }
    }

    public static double calculateInterest(int amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
