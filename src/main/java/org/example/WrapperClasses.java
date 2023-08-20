package org.example;

import java.util.ArrayList;

/***
 *  Auto Boxing Example
 */
public class WrapperClasses {
    public static void main(String[] args) {
        // Byte, Short, Integer, Long, Float, Double, Character, Boolean
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(101);
        list.add(-55);
        list.add(42);
        for (Integer i : list) {
            System.out.println(i);
        }

        // Getting the numeric value of a String
        String value = "450000";
        int number = Integer.parseInt(value);
        System.out.println(number);

        // Getting the numeric value of String as a Double
        String s2 = "3.14159";
        double num = Double.parseDouble(s2);
        System.out.println(num);
    }

    /***
     * getNumericValue(s)
     *
     * @param s is a String assumed to hold a numeric value
     * @return the integer value extracted from the string
     */
    private static int getNumericValue(String s) {
        return Integer.parseInt(s);
    }
}