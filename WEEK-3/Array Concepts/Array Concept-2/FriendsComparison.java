import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = scanner.nextInt();
            
            System.out.print("Enter height of " + friends[i] + " (in cm): ");
            heights[i] = scanner.nextDouble();
        }

        int minAge = ages[0];
        String youngest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = friends[i];
            }
        }

        
        double maxHeight = heights[0];
        String tallest = friends[0];
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = friends[i];
            }
        }

        System.out.println("\nThe youngest friend is: " + youngest + " (Age: " + minAge + ")");
        System.out.println("The tallest friend is: " + tallest + " (Height: " + maxHeight + " cm)");

        scanner.close();
    }
}
