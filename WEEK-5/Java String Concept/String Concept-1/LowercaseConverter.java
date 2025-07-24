import java.util.Scanner;

public class LowercaseConverter {

    
    public static String manualToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result += ch; 
        }
        return result;
    }

    
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();

       
        String builtInLower = input.toLowerCase();

        
        String manualLower = manualToLowerCase(input);
 
        boolean isSame = compareStrings(builtInLower, manualLower);

        
        System.out.println("\n=== Results ===");
        System.out.println("Original:        " + input);
        System.out.println("Built-in Lower:  " + builtInLower);
        System.out.println("Manual Lower:    " + manualLower);
        System.out.println("Strings match:   " + isSame);
    }
}
