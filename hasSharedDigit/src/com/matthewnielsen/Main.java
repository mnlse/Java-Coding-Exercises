package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(49, 32));
        System.out.println(hasSharedDigit(49, 92));
        System.out.println(hasSharedDigit(99, 99));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1 < 10 || num1 >= 100 || num2 < 10 || num2 >= 100) {
            return false;
        }

        int num1FirstDigit = num1 / 10;
        int num2FirstDigit = num2 / 10;
        int num1LastDigit = num1 % 10;
        int num2LastDigit = num2 % 10;

        boolean returnvalue = false;

        return (num1FirstDigit == num2LastDigit) || (num1FirstDigit == num2FirstDigit) || (num1LastDigit == num2FirstDigit)
                || (num1LastDigit == num2LastDigit);
    }
}

