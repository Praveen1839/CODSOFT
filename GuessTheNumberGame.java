import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0; 
        int roundsWon = 0; 
        System.out.println("Welcome to the number guessing game!");
        while (true) {
            int targetNumber = random.nextInt(100) + 1;
            int maxAttempts = 10;
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;
            totalRounds++;
            System.out.println("\nNew round started! Guess the numbers from 1 to 100");
            while (attemptsLeft > 0) { 
                System.out.print("\nEnter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;
                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                } else if (userGuess > targetNumber) {
                    System.out.println("Your guess is too high.");
                } else {
                    System.out.println("Your guess is too low.");
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry. You've used all your attempts. The correct number was " + targetNumber + ".");
            }
            System.out.println("\nGame complete!");
            System.out.println("Total number of rounds played: " + totalRounds);
            System.out.println("Rounds won: " + roundsWon);
            System.out.println("Your score: " + roundsWon + "/" + totalRounds);
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}