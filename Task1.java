/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gajanan Morbale
 */
public class Task1 {

    public static void main(String[] args) {

        final int MAX_ATTEMPTS = 5;
        final boolean MULTI_ROUNDS = true;
        final int POINTS_PER_GUESS = -1; // Points deducted for each guess (can be adjusted)
        final int POINTS_PER_ROUND = 10; // Points awarded for winning a round

        Random random = new Random();
        int randomNumber, userGuess;
        int score = 0; // Track user's score

        Scanner scanner = new Scanner(System.in);

        do {
            int attempts = 0;
            randomNumber = random.nextInt(100) + 1;
            System.out.println("Welcome to the guessing game! I'm thinking of a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts. Your current score: " + score);

            do {
                attempts++;
                System.out.println("Enter your guess: ");
                userGuess = scanner.nextInt();

                if (userGuess == randomNumber) {
                    score += POINTS_PER_ROUND + (attempts * POINTS_PER_GUESS); // Bonus for remaining attempts
                    System.out.println("Congratulations! 🎉 You guessed the number in " + attempts + " tries! Score: " + score);
                    break;
                } else if (attempts < MAX_ATTEMPTS) {
                    score += POINTS_PER_GUESS; // Deduct points for each guess
                    if (userGuess < randomNumber) {
                        System.out.println("Oh no, your guess is too low! 📉 Try again.");
                    } else {
                        System.out.println("Oops, your guess is too high! 📈 Maybe a bit lower next time?");
                    }
                    System.out.println(MAX_ATTEMPTS - attempts + " attempts remaining. Score: " + score);
                } else {
                    System.out.println("Sorry, you ran out of attempts! 😔 The number was " + randomNumber);
                    break;
                }

            } while (attempts < MAX_ATTEMPTS);

            if (MULTI_ROUNDS) {
                System.out.println("Play another round? (y/n)");
                String playAgain = scanner.next();

                if (!playAgain.equalsIgnoreCase("y")) {
                    System.out.println("Thanks for playing! Your final score was: " + score + " Come back soon! 👋");
                    break; // Exit entire loop if user chooses not to play again
                }
            } else {
                break; // Break out of main loop after one round if MULTI_ROUNDS is false
            }

        } while (MULTI_ROUNDS); // Keep looping for multiple rounds if enabled

    }
}


