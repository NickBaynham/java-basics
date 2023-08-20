package org.example;

import java.util.Scanner;

/***
 *  0 - 10 Inclusive
 *  Even integers Only
 */
public class EvenOnly {
    public static void main(String[] args) {

        // for loop solution
        System.out.println("for loop solution.");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "\t");
            }
        }
        System.out.println();

        // while loop solution
        System.out.println("while loop solution.");
        int counter = 0;
        while(counter <= 10) {
            if (counter % 2 !=0) {
                counter++;
                continue;
            }
            System.out.print(counter + "\t");
            counter++;
        }
        System.out.println();
        System.out.println("Done.");
    }
}
