package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(0.534, 0.534));
    }


    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num3 = (int) (num1 * 1000);
        int num4 = (int) (num2 * 1000);

        return num3 == num4;
    }
}
