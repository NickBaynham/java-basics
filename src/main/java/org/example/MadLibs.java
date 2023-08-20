package org.example;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Girl's Adj:\t");
        String adjectiveGirl = scanner.nextLine();
        System.out.println("Enter Girl's Name:\t");
        String girlsName = scanner.nextLine();
        System.out.println("Enter Girl's Occupation Adj:\t");
        String girlOccupationAdj = scanner.nextLine();
        System.out.println("Enter Girl's Occupation:\t");
        String girlOccupation = scanner.nextLine();
        System.out.println("Enter Girl's location:\t");
        String girlLocation = scanner.nextLine();
        System.out.println("Enter Girl's clothing:\t");
        String girlWears = scanner.nextLine();
        System.out.println("Enter Girl's hobby:\t");
        String girlHobby = scanner.nextLine();
        System.out.println("Enter Boy's Adj:\t");
        String boyAdj = scanner.nextLine();
        System.out.println("Enter Boy's occupation:\t");
        String boyOccupation = scanner.nextLine();
        System.out.println("Enter Boy's name:\t");
        String boyName = scanner.nextLine();
        System.out.println("Enter father's name:\t");
        String fatherName = scanner.nextLine();
        System.out.println();

        String story =
                "There once was a " + adjectiveGirl + " girl" +
                " named " + girlsName +
                " who was a " + girlOccupationAdj + " " + girlOccupation +
                " in the kingdom of " + girlLocation + ". " +
                "She loved to wear " + girlWears +
                " and to " + girlHobby + "." +
                " She wanted to marry the " + boyAdj + " " + boyOccupation + " " + boyName +
                " but her father, " + fatherName + " forbid her from seeing him."
                ;
        System.out.println(story);
    }
}
