package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
    }

    public static int getGreatestCommonDivisor(int a, int b) {
        if ( a < 0 || b < 0 ) {
            return -1;
        }

        int gcd = 1;

        int greaterNumber = a > b ? a : b;

        for(int i=2; i <= greaterNumber; i++) {
            if((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }

        return gcd;
    }

}
