import java.util.Scanner;

public class SumOfNaturalNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int formulaSum = (n * (n + 1)) / 2;
            int loopSum = 0;

            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }

        scanner.close();
    }
}
