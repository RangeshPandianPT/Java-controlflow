import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int EMPLOYEES = 10;
        double[] salary = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] bonus = new double[EMPLOYEES];
        double[] newSalary = new double[EMPLOYEES];
        
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        for (int i = 0; i < EMPLOYEES; i++) {
            while (true) {
                try {
                    System.out.print("Enter salary for employee " + (i + 1) + ": ");
                    salary[i] = Double.parseDouble(scanner.nextLine());
                    
                    System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = Double.parseDouble(scanner.nextLine());
                    
                    if (salary[i] <= 0 || yearsOfService[i] < 0) {
                        System.out.println("Invalid input. Salary must be greater than 0 and years of service must not be negative.");
                        i--; 
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    i--; 
                }
            }
        }
        
        for (int i = 0; i < EMPLOYEES; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}