import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();

        if (n > 0) {
            // Compute using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute using while loop
            int loopSum = 0, i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Compare results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct!");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        } else {
            System.out.println("Please enter a valid natural number (greater than 0).");
        }

        scanner.close();
    }
}
