package org.example.fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class SumFileNumbers {
    public static void main(String[] args) {
        Scanner scanner;
        List<Integer> numbers = new ArrayList<>();

        try {
            scanner = new Scanner(new File("src/main/resources/input.txt"));

            while (scanner.hasNext()) {
                numbers.add(scanner.nextInt());
            }
            scanner.close();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + sum/numbers.size());
    }
}
