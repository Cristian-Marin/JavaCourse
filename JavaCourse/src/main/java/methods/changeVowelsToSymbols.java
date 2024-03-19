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
codePhrase(phrase);
    }

    public static String codePhrase(String phrase) {
        
      for(int i=0; i==phraseLength; i++){
          
      }
        
        String vowel = null;
        switch (vowel){
            case "a":
                vowel = "@";
            case "e":
                vowel = "#";
            case "i":
                vowel = "$";
            case "o":
                vowel = "%";
            case "u":
                vowel = "*";
                }
        return null;
        }
    }