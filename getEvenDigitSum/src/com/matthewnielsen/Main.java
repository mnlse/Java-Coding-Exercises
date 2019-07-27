package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println("Value: 123456, result: " + getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit;
        int sum = 0;

        while(number > 0) {
            lastDigit = number % 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }

            number /= 10;
        }

        return sum;
    }
}
