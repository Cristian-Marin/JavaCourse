package loops;

import java.util.Scanner;

/*
Create a program that validates if a grade is between 0 and 10, if it’s not,
the grade will be asked again until it's correct.
 */

public class ValidateGrades {

    public static void main(String[] args) {

        int grade;

        System.out.println("Enter your grade.");
        Scanner scanner = new Scanner(System.in);
        grade = scanner.nextInt();

        while (grade < 0 || grade > 10) {
            System.out.println("Oops! Incorrect grade. Try again.");
            grade = scanner.nextInt();
        }

        System.out.println("Correct grade! " + grade + " is between 0 and 10.");

    }

}
