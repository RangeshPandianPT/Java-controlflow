import java.util.Scanner;

public class StringTrimmer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string with leading and trailing spaces:");
        String input = sc.nextLine();

        
        int[] startEnd = findStartEndIndexes(input);

        
        String manuallyTrimmed = createSubstring(input, startEnd[0], startEnd[1]);

        
        String builtInTrimmed = input.trim();

        
        boolean areEqual = compareStrings(manuallyTrimmed, builtInTrimmed);

        
        System.out.println("Manually Trimmed String: \"" + manuallyTrimmed + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both trimmed strings equal? " + areEqual);
    }

    
    public static int[] findStartEndIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

       
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

       
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    
    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
