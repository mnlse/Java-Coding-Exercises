package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        System.out.println(kiloBytes + " KB = " + convertMbToKb(kiloBytes));
    }

    public static String convertMbToKb(int kiloBytes) {
        int mb = kiloBytes / 1024;
        int kb = kiloBytes % 1024;
        return mb + " MB and " + kb + " KB";
    }
}
