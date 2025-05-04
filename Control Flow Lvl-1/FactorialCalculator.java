import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
       
        while (number < 0) {
            System.out.print("Please enter a non-negative integer: ");
            number = scanner.nextInt();
        }
        
        int factorial = 1;
        int i = number;
        
        while (i > 1) {
            factorial *= i;
            i--;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}