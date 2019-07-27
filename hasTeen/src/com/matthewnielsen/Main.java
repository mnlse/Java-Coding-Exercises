package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(30, 40, 111));
    }

    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    public static boolean isTeen(int num) {
        return (num >= 13 && num <= 19);
    }

}
