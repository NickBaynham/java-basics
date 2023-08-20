package org.example;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Method Overloading.");
        System.out.println(getResult(5));
        System.out.println(getResult(7, 6));
        System.out.println(getResult(5, "42"));
        System.out.println(getResult(getResult(5), getResult(2, 7)));
        System.out.println(getResult("Scott", "Steele"));
    }

    public static int getResult(int num) {
        return num * 2;
    }

    public static int getResult(int num1, int num2) {
        return num1 * num2;
    }

    public static int getResult(int num1, String value) {
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String s1, String s2) {
        return s1 + " " + s2;
    }
}
