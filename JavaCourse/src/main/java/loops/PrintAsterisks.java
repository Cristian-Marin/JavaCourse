package loops;

import java.util.Scanner;

/*
Write a program that reads in 4 numbers from 1 to 10. The program should print 
rows of asterisks equal to the value of each number."
 */
public class PrintAsterisks {

    public static void main(String[] args) {

        int number;

        System.out.println("Enter 4 numbers between 1 and 10.");

        for (int i = 0; i < 4; i++) {
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            while (number < 1 || number > 10) {
                System.out.println("Oops! The number should be between 1 and 10");
                number = scanner.nextInt();
            }
            System.out.print(number + " ");
            for (int j = 0; j < number; j++) {
                if (j < number) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}