import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
    
        int sum = 0;
        int originalNumber = number;
      
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += Math.pow(digit, 3); // Cube the digit and add to sum
            originalNumber /= 10; // Remove last digit
        }
      
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
