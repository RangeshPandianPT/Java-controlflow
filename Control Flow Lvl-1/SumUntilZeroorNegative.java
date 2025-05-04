import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
       
        double total = 0.0;
       
        Scanner scanner = new Scanner(System.in);
       
        double userInput;
        
        System.out.println("Enter numbers to sum (Enter 0 or a negative number to stop):");
       
        while (true) {
            userInput = scanner.nextDouble();
            
            if (userInput <= 0) {
                break;
            }
            
            total += userInput; 
            System.out.println("Current Total: " + total);
        }
      
        scanner.close();
       
        System.out.println("Final Total: " + total);
    }
}
