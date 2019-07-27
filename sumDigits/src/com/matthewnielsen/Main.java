package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(43));
        System.out.println(sumDigits(77));
    }

    public static int sumDigits(int number) {
        int sum = 0;

        if (number < 10) {
            return number;
        }

        while (number > 1) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        return sum;
    }
}
