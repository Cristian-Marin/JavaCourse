package conditionals;

/* Create a program that asks the user for two whole numbers, and 
determine if both or any of them is greater than 25.*/

import java.util.Scanner;

public class CompareNumbers {

    public static void main(String[] args) {

        int number1;
        int number2;

        System.out.println("Enter the first number.");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();

        System.out.println("Enter the second number.");
        number2 = scanner.nextInt();

        if (number1 > 25 && number2 > 25) {
            System.out.println("Both numbers are greater than 25. ");
        } else if (number1 > 25 || number2 > 25) {
            System.out.println("One of the numbers is greater than 25.");
        } else {
            System.out.println("Neither of the numbers is greater than 25.");
        }
    }
}
