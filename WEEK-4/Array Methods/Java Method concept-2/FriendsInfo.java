import java.util.Scanner;
public class FriendsInfo {
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        String tallest = names[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in meters: ");
            heights[i] = sc.nextDouble();
        }

        String youngest = findYoungest(names, ages);
        String tallest = findTallest(names, heights);

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);
    }
}
