import java.util.Scanner;

public class SumofNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n numbers: ");
        int n = scanner.nextInt();

        if (n > 0) {  
            int sum = n * (n + 1) / 2; 
            System.out.println("The sum of " + n + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        scanner.close();
    }
}
