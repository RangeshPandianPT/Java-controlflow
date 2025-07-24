import java.util.Scanner;

public class TextSplitter {

    public static int getLengthWithoutUsingLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
           
        }
        return count;
    }

    public static String[] customSplit(String text) {
        int length = getLengthWithoutUsingLengthMethod(text);
        
        int wordCount = 1;  // At least one word
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = getSubstring(text, start, end);
            start = end + 1;
        }
        words[wordCount - 1] = getSubstring(text, start, length);
        
        return words;
    }

    public static String getSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareWordArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String[] customWords = customSplit(input);

        String[] builtInWords = input.split(" ");

        boolean areEqual = compareWordArrays(customWords, builtInWords);

        System.out.println("\nWords using custom split:");
        for (String word : customWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nDo both arrays match? " + areEqual);

        scanner.close();
    }
}
