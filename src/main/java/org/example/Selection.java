package org.example;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        System.out.println("Running...");

        int age;
        System.out.println("Welcome to the Scott's Grille.");
        System.out.println("Please enter your age.");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        scanner.nextLine();

        if (age >= 21) {
            System.out.println("You are old enough to order alcohol.");
        } else if (age >= 16) {
            System.out.println("At least you can drive.");
        } else {
            System.out.println("You are not legally allowed to order alcohol.");
        }

        System.out.println("Thanks for visiting Scott's Grille.");
    }
}
