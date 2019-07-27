package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 8));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if(isBarking == false) {
            return false;
        }

        if(hourOfDay < 0 || hourOfDay > 24) {
            return false;
        }

        if(hourOfDay > 22 || hourOfDay < 8) {
            return true;
        } else {
            return false;
        }
    }
}
