package org.example;

public class StringBuilderExamples {
    public static void main(String[] args) {
        System.out.println("Running...");

        // If a variable changes frequently then StringBuilder is the better option since it is mutable
        StringBuilder sb = new StringBuilder("Hello Everyone");
        System.out.println(sb);

        sb.append(" and Welcome!");
        System.out.println(sb);

        sb.insert(6, "to ");
        System.out.println(sb);

        sb.replace(0, 8, "Hi"); // up to and excluding
        System.out.println(sb);

        // Replace first name with Dr.
        StringBuilder name = new StringBuilder("Jason Berner");
        System.out.println("The doctor is " + name);
        name.replace(0, 5, "Dr.");
        System.out.println("You may call him " + name);
    }
}
