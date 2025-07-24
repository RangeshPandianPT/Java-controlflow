import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; // Array to store up to 10 values
        double total = 0.0; // Variable to store sum of numbers
        int index = 0; // Index variable initialized to 0

       
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();
            
            
            if (input <= 0) {
                break;
            }
            
          
            numbers[index] = input;
            index++;
            
         
            if (index == 10) {
                break;
            }
        }

        
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        
       
        System.out.println("\nTotal sum: " + total);
    }
}
