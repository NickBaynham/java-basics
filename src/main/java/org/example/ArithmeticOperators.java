package org.example;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("Assignments:");
        int a = 10;
        int b = 15;
        System.out.println("Variable a was assigned " + a);
        System.out.println("Variable b was assigned " + b);

        System.out.println("\nArithmetic:");
        int sum = a + b; // assignment from an expression
        System.out.println("The sum is " + sum);

        int difference = a - b;
        System.out.println("The difference is " + Math.abs(difference));

        int product = a * b;
        System.out.println("The product is " + product);

        int quotient = b / a;
        System.out.println("The quotient is " + quotient);

        int remainder = b % a;  // binary operator
        System.out.println("The remainder is " + remainder);

        // Shortcut Arithmetic Operator Examples

        sum += 20;  // sum = sum + 20
        System.out.println("sum after adding 20 is " + sum);

        sum--;  // unary operator
        System.out.println(sum);
    }
}
