package org.example.fileioexceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutput {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("src/main/resources/output.txt");

            printWriter.println(100);
            printWriter.println(90);
            printWriter.println(77);
            printWriter.println(54);
            printWriter.println(32);

            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
