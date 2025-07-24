import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3]; 
        Random rand = new Random();

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); 
            }
        }

        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; 

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f\n",
                    (i + 1),
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    results[i][0],
                    results[i][1],
                    results[i][2]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
