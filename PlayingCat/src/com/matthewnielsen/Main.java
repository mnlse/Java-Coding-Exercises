package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 35));
        System.out.println(isCatPlaying(true, 34));
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        if(isSummer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if(!isSummer && temperature >= 25 && temperature <= 35) {
            return true;
        }

        return false;
    }
}
