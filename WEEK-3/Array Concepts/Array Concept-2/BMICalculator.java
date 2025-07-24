import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();
        
        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmiValues = new double[n];
        String[] statuses = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + " :");
            System.out.print("Enter height in meters: ");
            heights[i] = scanner.nextDouble();
            System.out.print("Enter weight in kg: ");
            weights[i] = scanner.nextDouble();
            
            bmiValues[i] = calculateBMI(weights[i], heights[i]);
            statuses[i] = getWeightStatus(bmiValues[i]);
        }
        
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n", heights[i], weights[i], bmiValues[i], statuses[i]);
        }
        
        scanner.close();
    }
    
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
