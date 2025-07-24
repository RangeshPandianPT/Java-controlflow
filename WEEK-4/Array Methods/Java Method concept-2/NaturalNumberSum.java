import java.util.Scanner;

public class NaturalNumberSum {
    
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number (positive integer). Exiting...");
            return;
        }
        
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        
        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);
        
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations are correct!");
        } else {
            System.out.println("Mismatch! Something went wrong.");
        }
        
        scanner.close();
    }
}