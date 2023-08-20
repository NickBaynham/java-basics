package org.example;

import java.util.Scanner;

public class AverageThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me three numbers please.");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int number2 = scanner.nextInt();
        scanner.nextLine();
        int number3 = scanner.nextInt();
        scanner.nextLine();
        int sum = number1 + number2 + number3;
        int average = sum / 3;
        System.out.println("The average is " + average);
    }
}
