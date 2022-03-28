import java.util.Scanner;

/**
 * The RockPaperScissors program asks the user to choose
 * between rock, paper and scissors then the random
 * generator tells the user if they win, loose or tie
 * with the computer.
 *
 * @author Ketia Gaelle Kaze
 * @version 1.0
 * @since 2022-03-22
 */

class RockPaperScissors {
    /**
    * Create a constant for rock.
    */
    private static final int ROCK = 1;
    /**
    * Create a constant for paper.
    */
    private static final int PAPER = 2;
    /**
    * Create a constant for scissors.
    */
    private static final int SCISSORS = 3;

    /**
    * Creating a private constructor due to
    * public/default constructor error.
    *
    * @throws illegalStateException if there is an issue
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Creating main function.
    *
    * @param args nothing passed in
    */

    public static void main(String[] args) {
        // declaring variables
        int tries = 0;
        int userGuessInt = 0;
        int loopCounter = 0;
        String userGuessString;
        Scanner sc = new Scanner(System.in);

        // use loop to get user guess
        while (loopCounter != 1) {
            // generate random number between min and max
            int randomNumber = (int) Math.floor(Math.random()
                * (SCISSORS - ROCK + 1) + ROCK);

            // get input from user
            System.out.println("Please enter 1: rock, 2: paper "
                + " or 3: scissors:  ");
            userGuessString = sc.nextLine();

            try {
                // convert user input from string to an int
                userGuessInt = Integer.parseInt(userGuessString);

                // check if guessed number is between 1 and 3
                if (userGuessInt >= ROCK && userGuessInt <= SCISSORS) {
                    // increment tries
                    tries++;

                    // conditions for a win, loss or tie
                    if (userGuessInt == randomNumber) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("It is a tie!");

                    } else if (userGuessInt == ROCK && randomNumber == PAPER) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You lost");

                    } else if (userGuessInt == PAPER && randomNumber == ROCK) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You Win!");
                        loopCounter += 1;

                    } else if (userGuessInt == ROCK && randomNumber
                        == SCISSORS) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You Win!");
                        loopCounter += 1;

                    } else if (userGuessInt == SCISSORS && randomNumber
                        == ROCK) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You lost");

                    } else if (userGuessInt == PAPER && randomNumber
                        == SCISSORS) {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You lost");

                    } else {
                        System.out.println("The computer chose: "
                            + randomNumber);
                        System.out.println("You chose: " + userGuessInt);
                        System.out.println("You win!");
                        loopCounter += 1;
                    }

                } else {
                    // display error message
                    System.out.println(userGuessInt
                        + " is not between 1 and 3");
                }

            } catch (IllegalStateException exception) {
                // invalid inputs
                System.out.println(userGuessString + " is not a valid integer. "
                    + "Please enter a valid integer.");
            }
        }
    }
}
