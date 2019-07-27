package com.matthewnielsen;

public class Main {

    private static final String INVALID_VALUE_MSG = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(625600);
        printYearsAndDays(525600 * 9);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MSG);
            return;
        }

        int years = 0;
        int days = (int) (minutes / 60 / 24);
        if (days >= 365) {
            years = days / 365;
            days = days % 365;
        }

        String yearsString;
        String daysString;

        if(years < 10) {
            yearsString = "0" + years;
        } else {
            yearsString = "" + years;
        }

        if(days < 10) {
            daysString = "0" + days;
        } else {
            daysString = "" + days;
        }


        System.out.println(minutes + " min = " + yearsString + " y and " + daysString + " d");

    }
}
