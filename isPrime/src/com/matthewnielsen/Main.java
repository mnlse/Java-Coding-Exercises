package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 50; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is prime.");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= (n / 2); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
