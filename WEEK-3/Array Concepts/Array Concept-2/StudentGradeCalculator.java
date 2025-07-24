import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"Physics", "Chemistry", "Maths"};
        int[] marks = new int[3];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double percentage = totalMarks / 3.0;

        char grade;
        if (percentage >= 80) {
            grade = 'A';
        } else if (percentage >= 70) {
            grade = 'B';
        } else if (percentage >= 60) {
            grade = 'C';
        } else if (percentage >= 50) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'R'; 
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
