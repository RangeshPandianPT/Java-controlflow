import java.util.Scanner;
public class BMICalculator {
	public void calculateBMI(double[][] data) {
    	for (int i = 0; i < data.length; i++) {
        	double weight = data[i][0];
        	double heightInMeters = data[i][1] / 100;
        	double bmi = weight / (heightInMeters * heightInMeters);
        	data[i][2] = bmi;
    	}
	}
	public String[] getBMIStatus(double[][] data) {
    	String[] status = new String[data.length];
    	for (int i = 0; i < data.length; i++) {
        	double bmi = data[i][2];
        	if (bmi <= 18.4) {
            	status[i] = "Underweight";
        	} else if (bmi <= 24.9) {
            	status[i] = "Normal";
        	} else if (bmi <= 39.9) {
            	status[i] = "Overweight";
        	} else {
            	status[i] = "Obese";
        	}
    	}
    	return status;
	}
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	BMICalculator calculator = new BMICalculator();
    	double[][] data = new double[10][3];
    	for (int i = 0; i < 10; i++) {
        	System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
        	data[i][0] = sc.nextDouble();
        	System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
        	data[i][1] = sc.nextDouble();
    	}
    	calculator.calculateBMI(data);
    	String[] status = calculator.getBMIStatus(data);
    	System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
    	for (int i = 0; i < 10; i++) {
        	System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][0], data[i][1], data[i][2], status[i]);
    	}
	}
}