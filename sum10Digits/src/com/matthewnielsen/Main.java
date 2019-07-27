package com.matthewnielsen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while(true) {
            System.out.println("Enter number " + count);
            boolean isNumber = scanner.hasNextInt();

            if(isNumber) {
                int number = scanner.nextInt();

                sum += number;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
                continue;
            }

            count++;

            if(count >= 10) {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Sum: " + sum);
        scanner.close();
    }
}
