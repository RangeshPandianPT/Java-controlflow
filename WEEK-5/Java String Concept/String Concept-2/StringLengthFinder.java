import java.util.Scanner;

public class StringLengthFinder {

    public static int getLengthWithoutUsingLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.next();

        
        int calculatedLength = getLengthWithoutUsingLengthMethod(input);
        int builtInLength = input.length();

       
        System.out.println("Length (calculated without using length()): " + calculatedLength);
        System.out.println("Length (using built-in length()): " + builtInLength);

        scanner.close();
    }
}
