package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println("Number of digits in 111: " + getDigitCount(111));
        System.out.println("Number of digits in 99999: " + getDigitCount(99999));
        System.out.println("Reversing 1234: " + reverse(1234));

        System.out.println("Number to words (1234): " + numberToWords(1234));
    }

    public static int reverse(int number) {
        int lastDigit = 0;
        int reverse = 0;

        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        int numDigits = 0;

        while (number > 0) {
            numDigits++;
            number /= 10;
        }

        return numDigits;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }


        String appendValue = "";
        int i = reverse(number);

        int lastDigit = i % 10;

        String words = "" + lastDigit;

        while(i > 0) {
            lastDigit = i % 10;

            switch(lastDigit) {
                case 0:
                    appendValue = "Zero";
                    break;
                case 1:
                    appendValue = "One";
                    break;
                case 2:
                    appendValue = "Two";
                    break;
                case 3:
                    appendValue = "Three";
                    break;
                case 4:
                    appendValue = "Four";
                    break;
                case 5:
                    appendValue = "Five";
                    break;
                case 6:
                    appendValue = "Six";
                    break;
                case 7:
                    appendValue = "Seven";
                    break;
                case 8:
                    appendValue = "Eight";
                    break;
                case 9:
                    appendValue = "Nine";
                    break;
            }

            words += (" " + appendValue);
            i /= 10;
        }
        return words;
    }
}
