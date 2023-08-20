package org.example;

public class Conversions {
    public static void main(String[] args) {
        double myDouble = 3.14;
        float myFloat = (float) 3.14; // narrowing or lossy conversion! Value is a double
        float float2 = 3.14f;  // Value is also a float
        double double1 = float2;  // widening or lossless conversion
        System.out.println(float2);
        System.out.println(double1);
    }
}
