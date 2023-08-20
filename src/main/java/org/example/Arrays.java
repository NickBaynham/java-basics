package org.example;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Running...");
        Random random = new Random();
        int[] randoms = new int[10];
        for (int i = 0; i < randoms.length; i++) {
            randoms[i] = random.nextInt(10);
        }

        for (int randomNumber : randoms) {
            System.out.print(randomNumber + "\t");
        }
        System.out.println();
        arrays();
        oneThroughTen();
        oneThrough(25);
        oneThrough(50);
        oneThrough(100);
        System.out.println("Done!");
    }

    private static void arrays() {
        // declaration and initialization of an array
        int[] array;
        array = new int[5];

        // assign values to individual elements in the array
        array[0] = 10;
        array[1] = 22;
        array[2] = 5;
        array[3] = 17;
        array[4] = 20;

        // display the contents of the array
        System.out.println("\n\nContents of the Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    /***
     * onethroughTen()
     *   Create an array of size 10
     *   Use a regular loop to populate the array of integers 1 through 10
     *   Use enhanced loop to print elements
     */
    private static void oneThroughTen() {
        int[] oneThru10 = new int[10];
        for (int i = 0; i < oneThru10.length; i++) {
            oneThru10[i] = i + 1;
        }
        for (int number : oneThru10) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }

    private static void oneThrough(int size) {
        int[] oneThru = new int[size];

        for (int i = 0; i < oneThru.length; i++) {
            oneThru[i] = i + 1;
        }

        for (int number : oneThru) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
