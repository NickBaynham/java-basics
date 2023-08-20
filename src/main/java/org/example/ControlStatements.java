package org.example;

public class ControlStatements {
    public static void main(String[] args) {
        System.out.println("Running...");

        // ---- Sequence

        int numDaysOfWeek = 7;
        System.out.println("There are " + numDaysOfWeek + " days in a week.");

        // ----- Selection

        if (numDaysOfWeek > 3) {
            System.out.println("We have more than three days in a week.");
        } else {
            System.out.println("There are less than three days in a week.");
        }

        // ----- Iteration

        int numberOfLines = 5;
        for (int i = 0; i < numberOfLines; i++) {
            System.out.println("[" + i + "] This is a line.");
        }
    }
}
