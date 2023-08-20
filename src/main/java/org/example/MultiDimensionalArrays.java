package org.example;

import java.util.Arrays;
import java.util.Random;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // row/column 5x5
        int[][] table = new int[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
        populate(table, random.nextInt(RANGE) + OFFSET);
        display(table);

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        populateRandom(table);
        display(table);

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        square(table);
        display(table);

        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Sum of values in the table is: " + sum(table));
        System.out.println("Average: " + average(table));
    }

    static void populate(int[][] table, int value) {
        for (int[] row : table) {
            Arrays.fill(row, value);
        }
    }

    static void populateRandom(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = random.nextInt(RANGE) + OFFSET;
            }
        }
    }

    static void square(int[][] table) {
        for (int[] row : table) {
            for (int i = 0; i < row.length; i++) {
                row[i] = (int) Math.pow(row[i], 2);
            }
        }
    }

    static int sum(int[][] table) {
        int sum = 0;
        for (int[] row: table) {
            for (int i : row) {
                sum += i;
            }
        }
        return sum;
    }

    static int average(int[][] table) {
        return sum(table) / (NUMBER_OF_ROWS * NUMBER_OF_COLUMNS);
    }

    static void display(int[][] table) {
        for (int[] t : table) {
            for (int i : t) {
                System.out.print(prettyPrint(i, CELL_WIDTH) + " ");
            }
            System.out.println();
        }
    }

    static String prettyPrint(int value, int maxLength) {
        StringBuilder printValue = new StringBuilder();
        printValue.append(value);
        int additionalSpaces = maxLength - printValue.length();
        for (int i = 0; i < additionalSpaces; i++) {
            printValue.insert(0, " ");
        }
        return printValue.toString();
    }

    private static final Random random = new Random();
    private static final int CELL_WIDTH = 6;
    private static final int NUMBER_OF_ROWS = 20;
    private static final int NUMBER_OF_COLUMNS = 8;
    private static final int RANGE = 100;
    private static final int OFFSET = -10;
}
