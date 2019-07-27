package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(30, 2));
        System.out.println(calcFeetAndInchesToCentimeters(-1, 2));
        System.out.println(calcFeetAndInchesToCentimeters(2));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || inches < 0)
            return -1;
        return (feet * 30.48) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        return (inches * 2.54);
    }
}
