package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
    }

    public static void printFactors(int number) {
        if(number < 0) {
            System.out.println("Invalid value.");
            return;
        }

        String factors = "1";

        for (int i=2; i <= number; i++) {
            if(number % i == 0) {
                factors += (" " + i);
            }
        }

        System.out.println("Factors: " + factors);
    }
}
