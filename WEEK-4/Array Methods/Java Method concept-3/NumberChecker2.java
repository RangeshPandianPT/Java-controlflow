import java.util.Arrays;

public class NumberChecker2 {
    
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = getDigitsArray(number);
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = getDigitsArray(number);
        int[][] frequency = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }

        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21; 
        System.out.println(countDigits(number));
        System.out.println(Arrays.toString(getDigitsArray(number)));
        System.out.println(sumOfDigits(number));
        System.out.println(sumOfSquaresOfDigits(number));
        System.out.println(isHarshadNumber(number));

        int[][] frequency = digitFrequency(number);
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println(frequency[i][0] + " " + frequency[i][1]);
            }
        }
    }
}