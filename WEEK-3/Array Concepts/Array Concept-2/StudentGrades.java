import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
       
        int[][] marks = new int[numStudents][3];
        
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        
        
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            int totalMarks = 0;
            
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = scanner.nextInt();
                totalMarks += marks[i][j];
            }
            
           
            percentages[i] = (double) totalMarks / 3;
            
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
        
        System.out.println("\nStudent Report:");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-12s %s\n", "Student", "Physics", "Chemistry", "Maths", "Percentage", "Grade");
        System.out.println("-------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-12.2f %c\n", (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        
        scanner.close();
    }
}