import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = scanner.nextDouble();

      
        double heightMeters = heightCm / 100.0;

        
        double bmi = weight / (heightMeters * heightMeters);

       
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);

        scanner.close();
    }
}
