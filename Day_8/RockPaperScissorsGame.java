/**
Scenario:
A game development company wants to create a simple Rock, Paper, Scissors game where a user plays against the computer.
Game Rules:
The player chooses one of the three options:
Rock (✊)
Paper (📄)
Scissors (✂️)
The computer randomly selects one of the three options.
The winner is determined by the following rules:
Rock beats Scissors (Rock crushes Scissors)
Scissors beats Paper (Scissors cut Paper)
Paper beats Rock (Paper wraps Rock)
If both choices are the same, it's a tie.
The game should continue until the player chooses to quit.


 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            int computerChoice = random.nextInt(3);

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice]);

            // Determine winner
            if (userChoice - 1 == computerChoice) {
                System.out.println("It's a Tie!");
            } 
            else if ((userChoice == 1 && computerChoice == 2) ||
                     (userChoice == 2 && computerChoice == 0) ||
                     (userChoice == 3 && computerChoice == 1)) {
                System.out.println("Computer Wins!");
            } 
            else {
                System.out.println("You Win!");
            }
        }

        scanner.close();
    }
}
