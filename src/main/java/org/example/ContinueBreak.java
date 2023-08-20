package org.example;

public class ContinueBreak {
    public static void main(String[] args) {
        System.out.println("Running...");

        // -- continue --

        int count = 0;
        while (count < 10) {
            if (count == 5) {
                count++;
                continue;
            } else {
                System.out.print(count + "\t");
                count++;
            }
        }
        System.out.println();

        // -- break --

        count = 0;
        while (count < 10) {
            if (count == 5) {
                System.out.println();
                System.out.println("*** Stopping: Count is " + count);
                break;
            } else {
                System.out.print(count + "\t");
                count++;
            }
        }
    }
}
