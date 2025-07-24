import java.util.Scanner;

public class TextProcessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a text:");
        String inputText = sc.nextLine();

        
        String[] words = splitTextIntoWords(inputText);

        String[][] wordLengthArray = createWordLengthArray(words);

      
        int[] shortestLongestIndexes = findShortestAndLongest(wordLengthArray);

        System.out.println("Shortest word: " + wordLengthArray[shortestLongestIndexes[0]][0]);
        System.out.println("Longest word: " + wordLengthArray[shortestLongestIndexes[1]][0]);
    }

    
    public static String[] splitTextIntoWords(String text) {
        String[] tempWords = new String[100]; 
        int wordCount = 0;
        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {
