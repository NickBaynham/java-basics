package org.example;
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        System.out.println("Running...");

        // Declaration and Initialization
        ArrayList<String> list = new ArrayList<>();

        // Assignments
        list.add("Scott");
        list.add("Dan");
        list.add("Jason");
        list.add("Raven");
        list.add("Whisper");

        // Output
        for (String name : list) {
            System.out.print(name + "\t");
        }
        System.out.println();

        // Output - regular for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();
    }
}
