package org.example;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        System.out.println("Running...");

        Random random = new java.util.Random();
        int randomNumber;

        randomNumber = random.nextInt();
        System.out.println("The random number is: " + randomNumber);

        randomNumber = random.nextInt(1000);
        System.out.println("The random number in range (0 - 9999) is: " + randomNumber);

        randomNumber = random.nextInt(100) + 1;
        System.out.println("The random number in range (1 - 100) is: " + randomNumber);
    }
}
