package methods;

import java.util.Scanner;

/**
 * Write a program that prompts the user to input a sequence of characters
 * ending in a period. Then code the entered word or phrase. Each vowel is
 * replaced by the following characters: a: @, e: #, i: $, o: %, u: *. The rest
 * of the characters remain unchanged. Make a subroutine that receives the
 * sequence of characters and returns the corresponding coding.
 */
public class changeVowelsToSymbols {

    public static void main(String[] args) {

        System.out.println("Please enter the word or phrase you want to code.");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.next();

        String letter;
        int phraseLength = phrase.length();

        for (int i = 0; i < phraseLength; i++) {
            letter = String.valueOf(phrase.charAt(i));
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