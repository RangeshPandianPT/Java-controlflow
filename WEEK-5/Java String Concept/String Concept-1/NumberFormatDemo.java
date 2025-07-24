import java.util.Scanner;

public class NumberFormatDemo {

   
    public static void generateException(String text) {
        System.out.println("Trying to convert text to number: " + text);
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number); 
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Trying to convert text to number: " + text);
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string to convert to number: ");
        String input = sc.next();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(input);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(input);
    }
}
