package methods;

import java.util.Scanner;

/**
 * Write a program that prompts the user to input a sequence of characters
 * ending in a period. Then code the entered word or phrase. Each vowel is
 * replaced by the following characters: a: @, e: #, i: $, o: %, u: *. The rest
 * of the characters remain unchanged. Make a subroutine that receives the
 * sequence of characters and returns the corresponding coding.
 */
public class ChangeVowelsToSymbols {

    public static void main(String[] args) {

        String dot;
        String phrase;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please enter a phrase you want to code, and add a period at the end.");
            phrase = scanner.nextLine();
            dot = String.valueOf(phrase.charAt(phrase.length() - 1));
        } while (!dot.equals("."));

        codedPhrase(phrase);
    }

    public static void codedPhrase(String phrase) {

        int phraseLength = phrase.length();
        String letter;

        for (int i = 0; i < phraseLength; i++) {
            letter = String.valueOf(phrase.charAt(i)).toLowerCase();
            switch (letter) {
                case "a":
                    letter = "@";
                    break;
                case "e":
                    letter = "#";
                    break;
                case "i":
                    letter = "$";
                    break;
                case "o":
                    letter = "%";
                    break;
                case "u":
                    letter = "*";
                    break;
            }
            System.out.print(letter);
        }
    }
}