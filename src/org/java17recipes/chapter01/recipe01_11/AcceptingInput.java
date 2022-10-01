package org.java17recipes.chapter01.recipe01_11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptingInput {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader( // BufferedReader detect line breaks in the input stream and enable you to conveniently read a line at a time
                new InputStreamReader(System.in)); // InputStreamReader take those bytes from System.in and convert them into characters
        String numberAsString = "";
        long numberAsLong = 0;

        boolean numberIsValid = false;
        do {
            /* Ask the user for a number. */
            System.out.println("Please enter a number: ");
//            try {
            numberAsString = keyboard.readLine(); // returns one line of input to the application
            System.out.println("You entered " + numberAsString);
//            } catch (IOException ex){
//                System.out.println(ex);
//            }

            /* Convert the number into binary form. */
            try {
                numberAsLong = Long.parseLong(numberAsString);
                numberIsValid = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Not a number!");
            }
        } while (numberIsValid == false);
    }
}
