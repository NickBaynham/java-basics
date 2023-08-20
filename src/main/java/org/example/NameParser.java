package org.example;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {

        // Input the first and last name
        System.out.print("Enter your first and last name: \t");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // Obtain the first and last names
        int indexOfLast = name.indexOf(" ") + 1;
        String first = name.substring(0, indexOfLast - 1);
        String last = name.substring(indexOfLast);

        // Display the first and then last name
        System.out.println("First: " + first.toLowerCase());
        System.out.println("Last: " + last.toUpperCase());
    }
}
