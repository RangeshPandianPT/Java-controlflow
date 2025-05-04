import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        double total = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        double userInput;
        
        System.out.println("Enter numbers to sum (Enter 0 to stop):");
        
        while ((userInput = scanner.nextDouble()) != 0) {
            total += userInput; 
            System.out.println("Current Total: " + total); 
        }
        
        scanner.close();
        
        System.out.println("Final Total: " + total);
    }
}