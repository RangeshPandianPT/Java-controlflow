import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) {
                    // Expand the array size
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
      
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}