package fundamentals;

import java.util.Scanner;

public class NameAge {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String name;
        int age;

        System.out.println("Enter your name.");
        name = read.nextLine();

        System.out.println("Enter your age.");
        age = read.nextInt();

        System.out.println("Your name's " + name + ". You're " + age + ".");
    }
}
