package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ParallelArray {
    public static void main(String[] args) {
        System.out.println("Running...");

        System.out.println("Initializing...");
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] Enter name:");
            names.add(i, scanner.nextLine());
            System.out.println("[" + i + "] Enter age:");
            ages.add(i, scanner.nextInt());
            scanner.nextLine();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(names.get(i) + " is " + ages.get(i) + " years old.");
        }
    }
}
