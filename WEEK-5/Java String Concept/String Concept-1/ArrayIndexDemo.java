import java.util.Scanner;

public class ArrayIndexDemo {

    static String[] names = {"Alice", "Bob", "Charlie", "David", "Eva"};

  
    public static void generateException(int index) {
        System.out.println("Accessing name at index: " + index);
       
        String name = names[index];
        System.out.println("Name: " + name); 
    }

    public static void handleException(int index) {
        try {
            System.out.println("Accessing name at index: " + index);
            String name = names[index];
            System.out.println("Name: " + name);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Array of names: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println(i + ": " + names[i]);
        }

       
        System.out.print("\nEnter an index to access a name: ");
        int index = sc.nextInt();

        System.out.println("\n=== Generating Exception ===");
        try {
            generateException(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\n=== Handling Exception Gracefully ===");
        handleException(index);
    }
}
