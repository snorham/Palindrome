package palindrome;

import java.util.Scanner;

/**
 * Created by Borham on 9/15/14.
 */
public class Palindrome {

    public static void main(String[] args) {
        boolean repeater = true;
        do {

            String entry;
            String reverseEntry = "";
            Scanner scanIt = new Scanner(System.in);
            int length;

            System.out.println("==SUPER PALINDROME CHECKER==");
            System.out.println();
            System.out.println("Please enter a word, phrase, or whatever you want:");
            entry = scanIt.nextLine();

            for (int currentCharSpot = (entry.length() - 1); currentCharSpot >= 0; currentCharSpot--)
                reverseEntry = reverseEntry + entry.charAt(currentCharSpot);

            System.out.println();
            System.out.println("\"" + entry + "\" backwards is \"" + reverseEntry + "\"");
            System.out.println();

            if ((entry.toLowerCase()).equals(reverseEntry.toLowerCase())) {
                System.out.println("Congratulations.  You have yourself a palindrome.");
            }
            else {
                System.out.println("Sorry.  You didn't enter a palindrome.");
            }

            System.out.println();

        }while(repeater);
        System.out.println();
        System.out.println();
        System.out.println("Goodbye! :D");

    }
}
