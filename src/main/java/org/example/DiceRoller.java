package org.example;

import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("Running...");

        int numberOfRolls = 10;
        int nextRoll;
        Random random = new Random();

        for (int i = 0; i < numberOfRolls; i++) {
            nextRoll = random.nextInt(6) + 1; // Random 1 - 6
            System.out.println("[" + i + "] Your rolled: " + nextRoll);
        }
    }
}
