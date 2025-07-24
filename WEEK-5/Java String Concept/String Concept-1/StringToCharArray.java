import java.util.Scanner;

public class StringToCharArray {

  
    public static char[] customToCharArray(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

   
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

   
    public static void printCharArray(char[] array) {
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String text = sc.next();

        
        char[] customArray = customToCharArray(text);
        char[] builtInArray = text.toCharArray();

       
        boolean isSame = compareCharArrays(customArray, builtInArray);

        
        System.out.println("\nCustom char array:");
        printCharArray(customArray);

        System.out.println("Built-in toCharArray result:");
        printCharArray(builtInArray);

        System.out.println("Are both arrays equal? " + isSame);
    }
}
