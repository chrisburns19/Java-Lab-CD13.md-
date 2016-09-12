import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);
        int numberOfGuesses = 0;

        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false) {


            System.out.println("Guess a number between 1 and 10 ");
            guess = input.nextInt();
            numberOfGuesses++;

            if (guess == numberToGuess) {
                win = true;

            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low");
            }
        }
        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("You guessed " + numberOfGuesses + " times.");
    }
}
