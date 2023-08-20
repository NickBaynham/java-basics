package org.example;

public class RelationalOperators {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;
        int age = 37;
        int age2 = 20;
        int age3 = 20;

        System.out.println("bool1 is " + bool1);
        System.out.println("bool2 is " + bool2);
        System.out.println("age1 is " + age);
        System.out.println("age2 is " + age2);
        System.out.println("age3 is " + age3);

        // Relational Operations

        boolean ageComparison = age > age2;
        System.out.println("age1 > age2 ? " + ageComparison);

        ageComparison = age2 > age3;
        boolean ageEqual = age2 == age3;
        System.out.println("Age 2 > Age 3 ? " + ageComparison);
        System.out.println("Age 2 equal to Age 3 ? " + ageEqual);

        // String compare

        String scott = "Scott Steele";
        String dan = "Dan Pfeiffer";
        boolean nameComparison = scott.equals(dan);
        System.out.println("Do names match? " + nameComparison);

        int currentAge = 60;
        boolean isGreaterThanOrEqualTo21 = currentAge >= 21;
        System.out.println("Age 21 or older? " + isGreaterThanOrEqualTo21);
    }
}
