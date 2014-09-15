package palindrome;

import java.util.Scanner;

/**
 * Created by Borham on 9/15/14.
 */
public class Palindrome {

    public static void main(String[] args) {
        boolean invalid = true, repeater = true;
        int stayChoice;

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
            System.out.println("Would you like to check another palindrome?");
            System.out.println("1) Yes");
            System.out.println("2) No");
            System.out.println();

            do {
                if (scanIt.hasNextInt()) {
                    stayChoice = scanIt.nextInt();

                    if (stayChoice == 2) {
                        invalid = false;
                        repeater = false;
                        System.out.println();
                        System.out.println();
                        System.out.println("GOODBYE! :)");
                    }

                    else {
                        if (stayChoice == 1) {
                            scanIt.nextLine();
                            invalid = false;
                            repeater = true;
                            System.out.println();
                            System.out.println();
                        } else {
                            scanIt.nextLine();
                            invalid = true;
                            repeater = true;
                            System.out.println();
                            System.out.println();
                            System.out.println("[Error: Incorrect Entry]");
                        }
                    }
                }
                else {
                    invalid = true;
                    repeater = true;
                    scanIt.nextLine();
                    System.out.println();
                    System.out.println("[Error: Incorrect Entry]");
                }

            }while(invalid);

        }while(repeater);
        System.out.println();
        System.out.println();
        System.out.println("Goodbye! :D");

    }
}
