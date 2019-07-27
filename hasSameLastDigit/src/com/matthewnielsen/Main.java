package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(33, 43, 533));
        System.out.println(hasSameLastDigit(34, 45, 57));
        System.out.println(hasSameLastDigit(39, 49, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c)) {
            return false;
        }

        int digit_a = a % 10;
        int digit_b = b % 10;
        int digit_c = c % 10;

        return (digit_a == digit_b || digit_b == digit_c || digit_a == digit_c);
    }

    public static boolean isValid(int number) {
        return (number > 10 && number < 1000);
    }
}
