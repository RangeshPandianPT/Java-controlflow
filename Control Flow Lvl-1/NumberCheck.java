import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int number2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int number3 = scanner.nextInt();
        
       
        boolean isSmallest1 = (number1 <= number2) && (number1 <= number3);
			System.out.println("Is the first number the smallest? " + isSmallest1);
		
		boolean isSmallest2 = (number2 <= number1) && (number2 <= number3);
			System.out.println("Is the Second number the smallest? " + isSmallest2);
			
		boolean isSmallest3 = (number3 <= number1) && (number3 <= number2);	
			System.out.println("Is the Third number the smallest? " + isSmallest3);
        
        scanner.close();
    }
}
