package org.example;

import java.util.Scanner;

public class SumInput {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Running...");
        int sum = 0;
        int nextNumber = 0;

        while (nextNumber >= 0) {
            System.out.print("Enter a number (negative number to quit:\t");
            nextNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            if (nextNumber >= 0) {
                sum += nextNumber;
                System.out.println("You entered " + nextNumber + ", sum is " + sum);
            } else {
                System.out.println("Done!");
            }
        }
    }
}
