import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        scanner.close();
       
        int sum = 0;
        int temp = number;
        
        while (temp > 0) {
            sum += temp % 10;  
            temp /= 10; 
        }
        
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is Not a Harshad Number.");
        }
    }
}
