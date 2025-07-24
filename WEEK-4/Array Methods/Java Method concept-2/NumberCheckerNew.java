import java.util.Scanner;
public class NumberCheckerNew {
    public boolean isPositive(int num) {
        return num >= 0;
    }
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
    public int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 < num2) return -1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NumberChecker checker = new NumberChecker();
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (checker.isPositive(num)) {
                if (checker.isEven(num)) {
                    System.out.println(num + " is positive and even.");
                } else {
                    System.out.println(num + " is positive and odd.");
                }
            } else {
                System.out.println(num + " is negative.");
            }
        }
        int result = checker.compare(numbers[0], numbers[4]);
        if (result == 1) {
            System.out.println("First element is greater than last element.");
        } else if (result == -1) {
            System.out.println("First element is less than last element.");
        } else {
            System.out.println("First element is equal to last element.");
        }
    }
}
