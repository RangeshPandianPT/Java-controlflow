
import java.util.Random;

public class EmployeeBonusCalculator {
    
    public static void main(String[] args) {
        int employees = 10;
        int[][] employeeData = new int[employees][2];         
        double[][] bonusData = new double[employees][2];       
		Random random = new Random();
        
             for (int i = 0; i < employees; i++) {
 employeeData[i][0] = 10000 + random.nextInt(90000);               
 employeeData[i][1] = random.nextInt(11);         }
        
       
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < employees; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            
            bonusData[i][0] = newSalary;
            bonusData[i][1] = bonus;
            
            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }
        
              System.out.println("Employee	Old Salary	Years of Service	Bonus Amount	New Salary");
        for (int i = 0; i < employees; i++) {
            System.out.printf("%d		%d		%d			%.2f		%.2f%n",
                    (i + 1), employeeData[i][0], employeeData[i][1], bonusData[i][1], bonusData[i][0]);
        }
        
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonus);
    }
}

