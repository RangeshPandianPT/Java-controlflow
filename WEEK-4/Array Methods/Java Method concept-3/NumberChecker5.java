import java.util.ArrayList;
import java.util.List;

public class NumberChecker5 {

    public static int[] getFactors(int num) {
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorsList.add(i);
            }
        }
        return factorsList.stream().mapToInt(i -> i).toArray();
    }

    public static int getGreatestFactor(int num) {
        int[] factors = getFactors(num);
        return factors[factors.length - 2]; // Exclude the number itself
    }

    public static int getSumOfFactors(int num) {
        int sum = 0;
        for (int factor : getFactors(num)) {
            sum += factor;
        }
        return sum;
    }

    public static long getProductOfFactors(int num) {
        long product = 1;
        for (int factor : getFactors(num)) {
            product *= factor;
        }
        return product;
    }

    public static long getProductOfCubesOfFactors(int num) {
        long product = 1;
        for (int factor : getFactors(num)) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfect(int num) {
        int sum = getSumOfFactors(num) - num;
        return sum == num;
    }

    public static boolean isAbundant(int num) {
        int sum = getSumOfFactors(num) - num;
        return sum > num;
    }

    public static boolean isDeficient(int num) {
        int sum = getSumOfFactors(num) - num;
        return sum < num;
    }

    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int testNumber = 12;
        System.out.println("Factors of " + testNumber + ": " + java.util.Arrays.toString(getFactors(testNumber)));
        System.out.println("Greatest Factor: " + getGreatestFactor(testNumber));
        System.out.println("Sum of Factors: " + getSumOfFactors(testNumber));
        System.out.println("Product of Factors: " + getProductOfFactors(testNumber));
        System.out.println("Product of Cube of Factors: " + getProductOfCubesOfFactors(testNumber));
        System.out.println("Is Perfect: " + isPerfect(testNumber));
        System.out.println("Is Abundant: " + isAbundant(testNumber));
        System.out.println("Is Deficient: " + isDeficient(testNumber));
        System.out.println("Is Strong: " + isStrong(testNumber));
    }
}