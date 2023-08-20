package org.example;

/***
 *   SquareDouble
 *
 *   Programming Exercise to write a method that returns the square of a double
 */
public class SquareDouble {
    public static void main(String[] args) {
        System.out.println("The square of 5 is " + squareDouble(5));
    }

    public static Double squareDouble(double number) {
        return Math.pow(number, 2);
    }
}


