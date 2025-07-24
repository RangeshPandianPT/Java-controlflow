import java.util.Scanner;

public class TriangularParkRun {
    
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the first side (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of the second side (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of the third side (in meters): ");
        double side3 = scanner.nextDouble();
        
        scanner.close();
        
        int rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete needs to complete " + rounds + " rounds to complete a 5 km run.");
    }
}
