package org.example;

public class Variables {
    public static void main(String[] args) {
        int age = 57; // variable declaration and initialization
        String name = "Scott";

        final int SOME_NUM = 150; // symbolic constant
        System.out.println(SOME_NUM);
        System.out.println(name + " is " + age); // age is a primitive type of int

        String hometown = "Walsall"; // String is a reference type
        System.out.println(hometown);
    }
}
