package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {
        System.out.println("Running...");

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double nextDouble = 0.0;

        while(true) {
            System.out.println("Enter the next real number (-1 to exit):");
            nextDouble = scanner.nextDouble();
            scanner.nextLine();
            if (nextDouble >= 0) {
                list.add(nextDouble);
            } else {
                break;
            }
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}