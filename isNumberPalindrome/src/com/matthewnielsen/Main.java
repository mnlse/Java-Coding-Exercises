package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(1554));
        System.out.println(isNumberPalindrome(-4554));
        System.out.println(isNumberPalindrome(1331));
        System.out.println(isNumberPalindrome(13315331));
        System.out.println(isNumberPalindrome(1111111111));
        System.out.println(isNumberPalindrome(11));
        System.out.println(isNumberPalindrome(123321));
    }

    private static boolean isNumberPalindrome(int number) {
        if(number < 0) {
            number = number * -1;
        }

        int reversed = 0;
        int numTens = 0;
        int lastDigit;
        int a = number;

        while(a > 0) {
            lastDigit = a % 10;
            reversed = (reversed * 10) + lastDigit;
            numTens++;
            a /= 10;
        }

        System.out.println("Number " + number + " reversed: " + reversed);

        int firstHalf = 0;
        int secondHalf = 0;
        int number2 = number;
        int numberReversed2 = reversed;


        // last digit
        int c;
        // last digit of reversed number
        int d;

        do {
            c = number2 % 10;
            d = numberReversed2 % 10;

            if( c != d ) {
                return false;
            }

            number2 /= 10;
            numberReversed2 /= 10;

        } while(number2 > 0);

        return true;
    }
}
