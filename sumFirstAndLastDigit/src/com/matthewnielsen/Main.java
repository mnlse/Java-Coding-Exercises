package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1333));
        System.out.println(sumFirstAndLastDigit(737));
        System.out.println(sumFirstAndLastDigit(-1));
        System.out.println(sumFirstAndLastDigit(0));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        }

        int firstDigit, lastDigit,
                reversedNumber = 0,
                iteratedNumber = number;

        while(iteratedNumber > 0) {
            lastDigit = iteratedNumber % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            iteratedNumber /= 10;
        }

        firstDigit = reversedNumber % 10;
        lastDigit = number % 10;

        return firstDigit + lastDigit;
    }
}
