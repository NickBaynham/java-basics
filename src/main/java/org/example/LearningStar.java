package org.example;

import java.util.Scanner;

/***
 * Learning Star
 * User can determine total cost after purchasing a package and a certain number of courses per month
 * Prompts the user for a package and total courses enrolled that month
 * Informs the user how much their total (including package costs) is for the month
 *
 * Packages:
 *   - Learning Package 1
 *     - $10/month, includes 2 courses per month
 *     - Each additional course is $6
 *   - Learning Package 2
 *     - $12/month, includes 4 courses per month
 *     - Each additional course is $4
 *   - Learning Package 3
 *     - $15/month, includes 6 courses per month
 *     - Each additional course is $3
 */
public class LearningStar {
    public static void main(String[] args) {
        System.out.println("Running...");
        Scanner scanner = new Scanner(System.in);
        int selectedPackage;
        int additionalCourses;
        int packagePrice;
        int additionalCoursePrice;
        int includedCourses;
        int monthlyTotal;

        // User selects a package (1, 2, or 3)
        System.out.println("Please enter the learning package (1, 2, or 3): ");
        selectedPackage = scanner.nextInt();
        scanner.nextLine();

        // User selects zero or more additional courses
        System.out.println("Please enter the number of additional courses: ");
        additionalCourses = scanner.nextInt();
        scanner.nextLine();

        // Calculate Total
        switch(selectedPackage) {
            case 1:
                packagePrice = 10;
                additionalCoursePrice = 6;
                includedCourses = 2;
                break;
            case 2:
                packagePrice = 12;
                additionalCoursePrice = 4;
                includedCourses = 4;
                break;
            case 3:
                packagePrice = 15;
                additionalCoursePrice = 3;
                includedCourses = 6;
                break;
            default:
                packagePrice = 0;
                additionalCoursePrice = 0;
                includedCourses = 0;
                System.out.println("Invalid selected package.");
        }

        if (additionalCourses > includedCourses) {
            additionalCourses = additionalCourses - includedCourses;
        }
        monthlyTotal = packagePrice + (additionalCoursePrice * additionalCourses);

        // Output the Total
        System.out.println("Your total is: $" + monthlyTotal + ".00");
    }
}
