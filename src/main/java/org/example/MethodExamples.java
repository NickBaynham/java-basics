package org.example;

public class MethodExamples {
    public static void main(String[] args) {
        printHello();
        printNumber(42);
        System.out.println("The number is: " + giveMe10());
        System.out.println("Sum is: " + addThese(giveMe10(), 42)); // arguments
    }

    public static void printHello() {
        System.out.println("Hello there!");
    }

    public static void printNumber(int number) {                    // method signature parameters
        System.out.println("The number is: " + number);
    }

    public static int giveMe10() {                                  // method returns an int
        return 10;
    }

    public static int addThese(int number1, int number2) {          // method returns an int, declares two parameters
        return number1 + number2;
    }
}