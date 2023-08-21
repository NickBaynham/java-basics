package org.example.fileioexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIODemo {
    public static void main(String[] args) {
        Scanner scanner;
        int input;

        try {
            scanner = new Scanner(new File("src/main/resources/input.txt"));

            while (scanner.hasNext()) {
                input = scanner.nextInt();
                System.out.println(input);
            }
            scanner.close();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
