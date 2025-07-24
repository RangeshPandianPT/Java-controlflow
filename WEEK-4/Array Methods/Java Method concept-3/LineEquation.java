import java.util.Scanner;

public class LineEquation {
    
    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; 
        
        if (x1 == x2) {
            throw new IllegalArgumentException("The line is vertical, slope is undefined.");
        }
        
        double m = (y2 - y1) / (x2 - x1); 
        double b = y1 - (m * x1); 
        
        result[0] = m;
        result[1] = b;
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
       
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        try {
           
            double[] equation = findLineEquation(x1, y1, x2, y2);
            System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}