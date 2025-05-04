import java.util.Scanner;

public class GreatestFactorFinder {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();
    
        int greatestFactor = 1;
      
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check divisibility
                greatestFactor = i;
                break; // Stop at the first largest factor
            }
        }
        
        System.out.println("Greatest factor (besides itself): " + greatestFactor);
    }
}
