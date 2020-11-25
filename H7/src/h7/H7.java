// program simulates a dice game in which 2 dice are thrown, determines if the player wins or loses with if statements and loop

package h7;

import java.util.Random;

public class H7 {

    public static void main(String[] args) {

        // create a random class to generate random numbers - call it "randGen"
        Random randGen = new Random();

        // create integer var for the first die, starts at 1, 6 possible values - call it "d1"
        int d1 = randGen.nextInt(6) + 1;

        // create integer var for the first die, starts at 1, 6 possible values - call it "d2"
        int d2 = randGen.nextInt(6) + 1;

        // create integer var to get the total roll of the dice
        int total = d1 + d2;

        // output the result of the first and second die
        System.out.println("The first die rolled a " + d1); // shows math
        System.out.println("The second die rolled a " + d2); // shows math

        // output the total roll of the dice
        System.out.println("The total is " + total);
        System.out.println(""); // output easier to read

        // create if block, output depending on condition, if total is 7 OR 11: say "Congratulations, you win", else if total is 2 OR 3 OR 12: say "You lose"
        if ((total == 7) || (total == 11)) {
            System.out.println("Congratulations, you win");
        } else if ((total == 2) || (total == 3) || (total == 12)) {
            System.out.println("You lose");
        } // execute else statements if previous conditions were not met
        else {

            // create integer var for a new total if the first and second dice do not total to 7 OR 11 (win) / 2 OR 3 OR 12 (loss), set to 0 - call it "newTotal"
            int newTotal = 0;

            // create while loop to continue rolling until the dice total to the original amount or stop at seven, move onto if block and print based on new total result
            while ((newTotal != 7) && (newTotal != total)) {
                System.out.println("Roll again"); // gives instructions if point is not established on 1st try
                d1 = randGen.nextInt(6) + 1;
                d2 = randGen.nextInt(6) + 1;
                System.out.println("The first die rolled a " + d1); // shows math
                System.out.println("The second die rolled a " + d2); // shows math
                newTotal = d1 + d2;
                System.out.println("The new total is " + newTotal);
                System.out.println(""); // output easier to read

                // create if block, if the new total equals to the original total: say "You win", else if the new total equals to 7 automatically or later: say "You lose"
                if (newTotal == total) {
                    System.out.println("You win");
                } else if (newTotal == 7) {
                    System.out.println("You lose");
                }

            } // end while 
        } // end else    
    }
}
