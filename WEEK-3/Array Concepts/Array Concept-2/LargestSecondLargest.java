import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int maxDigit = 10; e
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number > 0) {
            if (index == maxDigit) {
                maxDigit += 10; 
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            
            digits[index++] = number % 10;
            number /= 10;
        }
        
        if (index == 0) {
            System.out.println("No digits entered.");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
        
        scanner.close();
    }
}