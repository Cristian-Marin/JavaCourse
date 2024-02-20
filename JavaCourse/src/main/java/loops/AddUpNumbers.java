package loops;

import java.util.Scanner;

/*
Write a program that reads 10 numbers. If the number is equal to zero, 
you should exit the loop and display the message “The number zero was found”. 
Also, the program should calculate and display the result of the addition of the numbers,
but if the number is negative, it should not be added.
*/

public class AddUpNumbers {

    public static void main(String[] args) {

        int number;
        int total = 0;
        int i = 0;

        do {
            System.out.println("Enter a number to add.");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
             i++;
            if (number > 0) {
                total = total + number;
            } else {
                continue;
            }
        } while (number != 0 && i < 10);

        if (number == 0) {
            System.out.println("The number zero was found on the list.");
        } else {
            System.out.println("The total sum of the numbers is " + total + ".");
        }

    }

}
