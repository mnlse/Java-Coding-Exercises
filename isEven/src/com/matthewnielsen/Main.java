package com.matthewnielsen;

public class Main {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(isEvenNumber(i)) {
                System.out.println("Number " + i + " is even.");
            }
        }

        System.out.println("***************");

        findEvenNumbers(20, 40);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

    public static void findEvenNumbers(int start, int end) {
        int i = start;
        int count = 0;

        while(i < end) {
            i++;

            if(count >= 5) {
                return;
            }

            if (!isEvenNumber(i)) {
                continue;
            }

            System.out.println("Number " + i + " is even");
            count++;
        }

        System.out.println("Total numbers found: " + count);
    }
}
