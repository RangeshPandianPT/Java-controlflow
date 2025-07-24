import java.util.Scanner;

public class IllegalArgumentDemo {

   
    public static void generateException(String text) {
        int start = 5;
        int end = 2;

        
        System.out.println("Substring from " + start + " to " + end);
        String result = text.substring(start, end);
        System.out.println("Result: " + result); 
    }

   
    public static void handleException(String text) {
        int start = 5;
        int end = 2;

        try {
            System.out.println("Substring from " + start + " to " + end);
            String result = text.substring(start, end); 
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(input);
    }
}
