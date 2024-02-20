package fundamentals;

import java.util.Scanner;

public class SeasonYear {

    public static void main(String[] args) {

        System.out.println("Enter a season of the year.");
        Scanner scan = new Scanner(System.in);
        String season = scan.nextLine();

        System.out.println("Enter an adjective.");
        String adjective = scan.nextLine();

        System.out.println("Enter a whole number.");
        int number = scan.nextInt();

        System.out.println("On a " + adjective + " " + season
                + " day, I drink " + number + " cups of coffee.");
    }
}
