import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();

        
        int[][] pcmScores = generateScores(n);

        
        double[][] resultData = calculateResults(pcmScores);

        
        String[] grades = calculateGrades(resultData);

        
        displayScorecard(pcmScores, resultData, grades);
    }

    
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: P, C, M

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(41) + 60; // Scores between 60 to 100
            scores[i][1] = rand.nextInt(41) + 60;
            scores[i][2] = rand.nextInt(41) + 60;
        }

        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    
    public static String[] calculateGrades(double[][] resultData) {
        String[] grades = new String[resultData.length];

        for (int i = 0; i < resultData.length; i++) {
            double percentage = resultData[i][2];

            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        return grades;
    }

    
    public static void displayScorecard(int[][] scores, double[][] resultData, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\t\tPercentage\tGrade");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                    (int) resultData[i][0] + "\t" + resultData[i][1] + "\t\t" + resultData[i][2] + "%\t\t" + grades[i]);
        }
    }
}
