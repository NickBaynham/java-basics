package org.example;

public class StringExamples {
    public static void main(String[] args) {
        System.out.println("Running...");

        // Lexicographical Comparisons
        String name = "Dan Pfeiffer";
        String name2 = "Dan Pfeiffer";
        String name3 = "Scott Steele";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();

        // testing for equality
        System.out.println("Are strings with the same characters the same object? " + (name == name2));
        System.out.println("Do the strings with the same characters resolve to equal? " + name.equals(name2));

        // compare to
        System.out.println("Compare name to name3: " + name.compareTo(name3));
        System.out.println("Compare name to name2: " + name.compareTo(name2));

        // String methods

        String blurb = "I am Scott Steele";
        System.out.println("The original blurb is: " + blurb);
        System.out.println("Uppercase: " + blurb.toUpperCase());
        System.out.println("Lowercase: " + blurb.toLowerCase());
        System.out.println("Substring: " + blurb.substring(5, 16));
        System.out.println("Starting Position of name: " + blurb.indexOf('S'));
        System.out.println("Starting Position of name: " + blurb.indexOf("Scott Steele"));
        System.out.println("Last name: " + blurb.substring(blurb.indexOf("Steele")));
    }
}
