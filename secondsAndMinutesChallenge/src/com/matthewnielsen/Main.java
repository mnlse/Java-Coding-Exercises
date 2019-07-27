package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        getDurationString(30, 0);
        getDurationString(60, 0);
        getDurationString(65, 0);
        getDurationString(65);
    }

    public static void getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || seconds > 59) {
            return;
        }

        int hours = minutes / 60;
        minutes = minutes % 60;

        System.out.println(hours + "h " + minutes + "m " + seconds + "s" );
    }

    public static void getDurationString(int seconds) {
        if(seconds < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        System.out.println(minutes + "m " + seconds + "s");
    }
}
