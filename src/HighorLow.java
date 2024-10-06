import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        boolean validInput;

        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess >= 1 && userGuess <= 10) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input: Number must be between 1 and 10.");
                    validInput = false;
                }
            } else {
                String trash = scanner.nextLine();
                System.out.println("Invalid input: " + trash);
                validInput = false;
            }
        } while (!validInput);

        System.out.println("Random number was: " + randomNumber);
        if (userGuess < randomNumber) {
            System.out.println("Your guess is too low.");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high.");
        } else {
            System.out.println("Your guess is on the money!");
        }
    }
}