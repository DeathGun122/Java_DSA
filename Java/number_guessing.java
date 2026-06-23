import java.util.*;

public class number_guessing {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess, attempt = 0;
        int min = 1, max = 10;
        int randomNumber = random.nextInt(min, max + 1);
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between " + min + " and " + max + ": ");

        do { 
            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();
            attempt++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " correctly!");
            }

        } while (guess != randomNumber);

        System.out.println("It took you " + attempt + " attempts to guess the number.");
        scanner.close();
    }
}
