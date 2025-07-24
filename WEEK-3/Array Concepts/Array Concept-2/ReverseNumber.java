import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
     
        String numStr = Integer.toString(Math.abs(num));
        int length = numStr.length();
        
   
        int[] digits = new int[length];
       
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        int[] reversedDigits = new int[length];
        
        for (int i = 0; i < length; i++) {
            reversedDigits[i] = digits[length - 1 - i];
        }
        
        System.out.print("Reversed number: ");
        for (int digit : reversedDigits) {
            System.out.print(digit);
        }
        
        System.out.println();
        scanner.close();
    }
}
