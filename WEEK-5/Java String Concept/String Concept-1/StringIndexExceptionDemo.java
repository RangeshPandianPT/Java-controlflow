import java.util.Scanner;

public class StringIndexExceptionDemo {

    
    public static void generateException(String text) {
       
        System.out.println("Accessing character at index " + text.length());
        char ch = text.charAt(text.length()); 
        System.out.println("Character: " + ch); 
    }

    
    public static void handleException(String text) {
        try {
            System.out.println("Accessing character at index " + text.length());
            char ch = text.charAt(text.length()); 
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.next();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(input); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(input);
    }
}
