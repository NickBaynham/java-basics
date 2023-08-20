package org.example;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char grade;

        System.out.println("Enter a grade:");
        grade = scanner.next().charAt(0);

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job!");
                break;
            case 'C':
            case 'c':
                System.out.println("Pretty good!");
                break;
            case 'D':
            case 'd':
                System.out.println("Not great.");
                break;
            case 'F':
            case 'f':
                System.out.println("Sorry, you have failed.");
                break;
            default:
                System.out.println("Invalid grade.");
        }
    }
}
