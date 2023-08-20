package org.example;

public class Repetition {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println("[While] Iteration: " + count);
            count ++;
        }

        int count2 = 0;
        do {
            System.out.println("[Do-While] Iteration: " + count2);
            count2++;
        } while (count2 < 10);

        for (int count3 = 0; count3 < 10; count3++) {
            System.out.println("[For] Iteration: " + count3);
        }
    }
}
