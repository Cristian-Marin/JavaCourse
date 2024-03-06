package conditionals;

/*
You're going to create a program that asks the user to enter the quantities 
for the following coins.
-You'll ask them how many pennies would you like?
-How many nickels would you like?
-How many dimes?
-And then, how many quarters?

What your program is going to do is count up the value of all of the change that
they answered.
-If it's exactly one dollar then they win the game.
-If it's more than one dollar, then you need to tell them that it's more than 
one dollar and how much they went over.
-If it's less than one dollar, tell them how much they went under.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class DollarGameChange {

    public static void main(String[] args) {

        String cents;
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        int dollar = 1;
        double total;

        System.out.println("Welcome to Change for a Dollar!"
                + " Your goal is to enter enough change to make $1.");

        System.out.println("How many pennies would you like?");
        Scanner scanner = new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = scanner.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = scanner.nextInt();

        total = (pennies * penny) + (nickels * nickel) + (dimes * dime) + (quarters * quarter);

        DecimalFormat decimalFormat = new DecimalFormat("#");

        if (total < dollar) {
            cents = decimalFormat.format((dollar - total) * 100);
            System.out.println("Sorry! You were short by ¢" + cents + ".");
        } else if (total > dollar) {
            if (total - dollar <= 1) {
                cents = decimalFormat.format((total - dollar) * 100);
                System.out.println("Sorry! You went over by ¢" + cents + ".");
            } else {
                System.out.println("Sorry! You went over by $" + String.format("%.2f", total - dollar) + ".");
            }
        } else {
            System.out.println("Congratulations, you won! You have exactly $1.");
        }
    }
}
