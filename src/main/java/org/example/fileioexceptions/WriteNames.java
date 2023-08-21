package org.example.fileioexceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WriteNames {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Scott Steele");
        names.add("Jason Berner");
        names.add("Dan Pfeiffer");
        names.add("Raven Danger");
        names.add("Willow Parkes");

        try {
            PrintWriter printWriter = new PrintWriter("src/main/resources/names_output.txt");
            for (String name : names) {
                printWriter.print(name);
                printWriter.println();
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
