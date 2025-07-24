import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        
        int[] result = findRemainderAndQuotient(dividend, divisor);

       
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        scanner.close();
    }

    
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}
