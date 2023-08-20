package org.example;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("running.");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Welcome " + name + "!");

        int age;
        System.out.println("What is your age?");
        age = scanner.nextInt();
        scanner.nextLine(); // Have to consume the new line character to avoid a bug.
        System.out.println(name + "  is " + age + " years old.");

        double weight;
        System.out.println("What is your weight?");
        weight = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        weight *= 2;
        System.out.println(name + " weighs " + weight + ".");

        String city;
        System.out.println("What city do you live in?");
        city = scanner.nextLine();
        System.out.println(name + " lives in " + city + ".");
    }
}
