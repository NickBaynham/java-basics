package org.example;

import java.util.Random;
import java.util.Scanner;

/***
 *  Guess The Number
 *    A number is randomly generated between 1 and 100 (inclusive)
 *    The User is asked to make a guess
 *    Inform the user of whether they guessed correctly, too low, or too high
 *    User tries again if not a winner
 *    If a user selects a number out of range, output: That was a wasted guess!
 */
public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("Running...");

        Scanner scanner = new Scanner(System.in);
        int guess;
        Random random = new Random();
        int number = random.nextInt(100) + 1; ;
        int numberOfGuesses = 0;

        while (true) {
            System.out.println("Guess a number between 1 and 100:");
            guess = scanner.nextInt();
            scanner.nextLine();
            numberOfGuesses++;
            if (guess < 1 || guess > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100 inclusive.");
            } else if (guess == number) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses +
                        " guesses! Thanks for playing!");
                break;
            } else if (guess < number) {
                System.out.println("Your guess was too low! Please try again.");
            } else {
                System.out.println("Your guess was too high! Please try again.");
            }
        }
    }
}