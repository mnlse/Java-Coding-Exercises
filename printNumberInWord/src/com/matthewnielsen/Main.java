package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
    }

    public static void printNumberInWord(int number) {
        String value = "";
        switch(number) {
            case 0:
                value = "ZERO";
                break;
            case 1:
                value = "ONE";
                break;
            case 2:
                value = "TWO";
                break;
            case 3:
                value = "THREE";
                break;
            case 4:
                value = "FOUR";
                break;
            case 5:
                value = "FIVE";
                break;
            case 6:
                value = "SIX";
                break;
            case 7:
                value = "SEVEN";
                break;
            case 8:
                value = "EIGHT";
                break;
            case 9:
                value = "NINE";
                break;
            default:
                value = "OTHER";
        }

        System.out.println(value);
    }
}
