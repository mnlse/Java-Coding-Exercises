package com.matthewnielsen;

public class Main {
    public static void main(String[] args) {
        printConversion(-1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
            return;
        }

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
