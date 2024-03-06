package loops;

/**
 * The objective of this game is to travel the entire game board of 20 spaces
 * within 5 die rolls.
 *
 * Roll the die for the user (generate a random number between 1 – 6) and
 * advance the user that number of spaces on the game board.
 *
 * After each roll, tell the user which game space they are on and how many more
 * spaces they have to go to win.
 *
 * Repeat this 4 additional times, for 5 rolls in total.
 *
 * If the user gets to 20 before 5 rolls, end the game - they’ve won.
 *
 * If they are greater than or less than 20 spaces exactly, they lose.
 */

import java.util.Random;

public class RollDieGame {

    public static void main(String[] args) {
        int spaces = 20;
        int currentSpace = 0;
        int spacesLeft;

        System.out.println("Welcome to Roll the Die Game!");
        System.out.println("The objective of this game is to travel the entire "
                + "game board of 20 spaces within 5 die rolls.");

        for (int i = 0; i < 5; i++) {
            Random random = new Random();
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            spacesLeft = spaces - currentSpace;

            if (i < 4 && currentSpace < 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die
                        + ". You're now on space " + currentSpace + " and have "
                        + spacesLeft + " left to go.");
            } else if (i <= 4 && currentSpace == 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die
                        + ". You're now on space " + currentSpace + " .Congrats, you win!");
            } else if (i == 4 && currentSpace < 20) {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die
                        + ". You're now on space " + currentSpace
                        + ". Oops, you lose! You didn't reach space 20.");
            } else {
                System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die
                        + ". Oops, you lose! You went over space 20.");
                break;
            }
        }
    }
}
