import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
      
        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
        } else {
            int result = 1;
            
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            
            
            System.out.println(number + "^" + power + " = " + result);
        }
        
        scanner.close();
    }
}
