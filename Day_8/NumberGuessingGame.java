/**
Scenario:
A gaming company wants to develop a simple "Number Guessing Game" where the player tries to guess a randomly generated number within a limited number of attempts.
Game Rules:
The program generates a random number between 1 and 100.
The player has 5 attempts to guess the number.
After each guess, the program provides feedback:
"Too High!" if the guess is greater than the number.
"Too Low!" if the guess is smaller than the number.
"Correct! You Win!" if the guess matches the number.
If the player fails to guess within 5 attempts, the game displays "Game Over! The number was X".
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int secretNumber = random.nextInt(100) + 1; // 1 to 100
        int maxAttempts = 5;
        boolean isGuessed = false;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts.\n");

        for (int attempt = 1; attempt <= maxAttempts; attempt++) {

            System.out.print("Attempt " + attempt + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("✅ Correct! You Win!");
                isGuessed = true;
                break;
            } 
            else if (guess > secretNumber) {
                System.out.println("📉 Too High!");
            } 
            else {
                System.out.println("📈 Too Low!");
            }

            System.out.println();
        }

        if (!isGuessed) {
            System.out.println("❌ Game Over! The number was " + secretNumber);
        }

        scanner.close();
    }
}

