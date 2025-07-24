import java.util.Scanner;

public class CalendarDisplay {

   
    private static final String[] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
    
    private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    private static int getNumberOfDays(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }
   
    private static int getFirstDayOfMonth(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31 * m) / 12) % 7;
    }
    
    private static void displayCalendar(int month, int year) {
        System.out.println("\n   " + MONTHS[month - 1] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getNumberOfDays(month, year);
        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input. Please enter a valid month (1-12) and year.");
        } else {
            displayCalendar(month, year);
        }
        
        scanner.close();
    }
}