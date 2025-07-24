import java.util.Arrays;

public class NumberChecker3 {
    
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }
    
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(Math.abs(num));
        int[] digits = new int[numStr.length()];
        
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }
    
    public static boolean isDuckNumber(int num) {
        String numStr = String.valueOf(Math.abs(num));
        return numStr.contains("0") && numStr.charAt(0) != '0';
    }
    
    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int sum = 0, power = digits.length;
        
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == num;
    }
    
    public static int[] findLargestAndSecondLargest(int num) {
        int[] digits = getDigitsArray(num);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    
    public static int[] findSmallestAndSecondSmallest(int num) {
        int[] digits = getDigitsArray(num);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    
    public static void main(String[] args) {
        int num = 153;  // Change this number to test other cases
        
        System.out.println("Number: " + num);
        System.out.println("Count of digits: " + countDigits(num));
        System.out.println("Digits Array: " + Arrays.toString(getDigitsArray(num)));
        System.out.println("Is Duck Number? " + isDuckNumber(num));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));
        
        int[] largestNumbers = findLargestAndSecondLargest(num);
        System.out.println("Largest Digit: " + largestNumbers[0] + ", Second Largest Digit: " + largestNumbers[1]);
        
        int[] smallestNumbers = findSmallestAndSecondSmallest(num);
        System.out.println("Smallest Digit: " + smallestNumbers[0] + ", Second Smallest Digit: " + smallestNumbers[1]);
    }
}