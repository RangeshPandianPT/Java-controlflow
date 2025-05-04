import java.util.Scanner;

public class VotingAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The age : ");
        int n = scanner.nextInt();

        if (n >= 18) {   
            System.out.println("The person's age is " + n + " and can vote");
        } else {
            System.out.println("The person's age is " + n + " and cannot vote.");
        }

        scanner.close();
    }
}
