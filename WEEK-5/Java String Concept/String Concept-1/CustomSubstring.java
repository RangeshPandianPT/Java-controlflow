import java.util.Scanner;

public class CustomSubstring {

    
    public static String customSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }

        return sb.toString();
    }

    
    public static boolean compareUsingCharAt(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        
        String substringCharAt = customSubstring(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        boolean isEqual = compareUsingCharAt(substringCharAt, substringBuiltIn);

        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);
    }
}
