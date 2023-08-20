package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class NamePermutations {
    public static void main(String[] args) {
        System.out.println("Running...");

        // initialization
        int numberOfNames = 5;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> permNames = new ArrayList<>();

        // Get names
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("[" + i + "] Enter the next full name: \t");
            names.add(scanner.nextLine());
        }
        System.out.println();

        // Separate first and last names
        for (int i = 0; i < numberOfNames; i++) {
            int indexOfLast = names.get(i).indexOf(" ");
            firstNames.add(names.get(i).substring(0, indexOfLast));
            lastNames.add(names.get(i).substring(indexOfLast + 1));
        }

        // Generate Permutations
        for (int i = 0; i < numberOfNames; i++) {
            for (int j = 0; j < numberOfNames; j++) {
                permNames.add(firstNames.get(i) + " " + lastNames.get(j));
            }
        }

        // Output the Permutation Names
        for (String permName : permNames) {
            System.out.println(permName);
        }
    }
}