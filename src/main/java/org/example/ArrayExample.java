package org.example;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        System.out.println("Running...");
        Scanner scanner = new Scanner(System.in);
        int[] integers = new int[5];
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Please enter integer #" + i + ":");
            integers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for (int number : integers) {
            System.out.print((number * 2) + "\t");
        }
        System.out.println();
    }
}
