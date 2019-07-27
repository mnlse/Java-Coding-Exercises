package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        boolean answer = false;

        if (year < 0 || year <= 10000) {
            return false;
        }

        if(year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    answer = true;
                } else {
                    answer = false;
                }
            } else {
                answer = true;
            }
        } else {
            answer = false;
        }

        return answer;
    }
}
