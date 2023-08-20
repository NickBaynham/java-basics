package org.example;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining and warm? " + combined);

        combined = isRaining || isWarm;
        System.out.println("Is it raining or warm? " + combined);

        combined = !isRaining;
        System.out.println("Is it not raining outside? " + combined);
    }
}
