package org.example;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        int age;
        char gender;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Alpha-Phi Fraternity. We need some information to check your eligibility.");
        System.out.print("Please enter your gender (M=Male; F=Female):\t");
        gender = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println();
        System.out.print("Please enter your age:\t");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        if (age >= 19) {
            switch(gender) {
                case 'M':
                case 'm':
                    System.out.println("Congratulations! You are eligible to join.");
                    break;
                case 'F':
                case 'f':
                    System.out.println("Sorry, you have to be male to join.");
                    break;
                default:
                    System.out.println("Invalid gender.");
            }
        } else {
            System.out.println("Sorry, You are not eligible to join as you need to be at least 19 years of age.");
        }
    }
}
