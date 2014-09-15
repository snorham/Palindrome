package palindrome;

import java.util.Scanner;

/**
 * Created by Borham on 9/15/14.
 */
public class Palindrome {

    public static void main(String[] args) {

        String entry;
        String reverseEntry = "";
        Scanner scanIt = new Scanner(System.in);
        int length;

        System.out.println("==SUPER PALINDROME CHECKER==");
        System.out.println("Please enter a word, phrase, or whatever you want:");
        entry = scanIt.nextLine();

        for (int currentCharSpot = (entry.length() - 1) ; currentCharSpot >= 0 ; currentCharSpot-- )
            reverseEntry = reverseEntry + entry.charAt(currentCharSpot);


    }
}
