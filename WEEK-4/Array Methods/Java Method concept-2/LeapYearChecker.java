import java.util.Scanner;

public class LeapYearChecker {
   
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            throw new IllegalArgumentException("Year must be 1582 or later.");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        try {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}