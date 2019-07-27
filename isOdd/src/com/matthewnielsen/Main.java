package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            if(isOdd(i)) {
                System.out.println("Number " + i + " is odd.");
            }
        }

        System.out.println("Sum: " + sumOdd(1, 10));
    }


    public static int sumOdd(int start, int end) {
        if(start > end || start < 0) {
            return -1;
        }

        int sum = 0;

        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isOdd(int number) {
        if(number < 0) {
            return false;
        }

        return (number % 2 > 0);
    }
}
