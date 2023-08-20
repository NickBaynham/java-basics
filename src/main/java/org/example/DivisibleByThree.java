package org.example;

import java.util.Scanner;

/***
 *   Divisible by Three
 *
 *   User enters an integer
 *   Output to the user if the integer is divisible for three or not
 *
 */
public class DivisibleByThree {
    public static void main(String[] args) {
        System.out.println("Running...");

        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Please enter a number.");
        input = scanner.nextInt();
        scanner.nextLine();

        if (input % 3 == 0) {
            System.out.println("This number is divisible by three.");
        } else {
            System.out.println("This number is NOT divisible by three.");
        }
    }
}
