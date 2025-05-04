import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
       
        double average = (physics + chemistry + maths) / 3.0;
        
    
        char grade;
        String remarks;
        
        if (average >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (average >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (average >= 60) {
            grade = 'C';
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (average >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (average >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }
        
       
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        scanner.close();
    }
}
