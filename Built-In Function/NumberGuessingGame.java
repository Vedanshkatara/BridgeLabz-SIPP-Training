
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100, guess;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100. Let the computer guess it!");
        do {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Computer guesses: " + guess);
            System.out.print("Enter 'high', 'low', or 'correct': ");
            feedback = scanner.next();

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
        } while (!feedback.equals("correct"));
        System.out.println("Computer guessed your number!");
        scanner.close();
    }
}
