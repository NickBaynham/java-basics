package org.example;

public class RecursionExamples {
    public static void main(String[] args) {
        doSomething();
        recursion(99);

        System.out.println();
        System.out.println("---------");
        System.out.println();

        countDownFrom(10);

        System.out.println();
        System.out.println("---------");
        System.out.println();

        countUpTo(10, 25);
    }

    private static int getSomething() {
        return 150;
    }
    private static void doSomething() {
        System.out.println("Do Something!");
        int result = getSomething();
        System.out.println("Result: " + result);
    }

    // -- Recursion

    private static int recursion(int value) {
        System.out.println("Value is: " + value);
        if (value < 1) {
            return 0;
        } else {
            return recursion(--value);
        }
    }

    private static void countDownFrom(int value) {
        if (value >= 0) {
            System.out.println(value);
            countDownFrom(value - 1);
        }
    }

    private static void countUpTo(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            countUpTo(++start, end);
        }
    }
}
