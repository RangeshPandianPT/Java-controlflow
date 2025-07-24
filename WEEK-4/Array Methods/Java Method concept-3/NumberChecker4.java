public class NumberChecker4 {

   
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return String.valueOf(square).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    
    public static void main(String[] args) {
        int testNumber = 7;
        System.out.println(testNumber + " is Prime: " + isPrime(testNumber));
        System.out.println(testNumber + " is Neon: " + isNeon(testNumber));
        System.out.println(testNumber + " is Spy: " + isSpy(testNumber));
        System.out.println(testNumber + " is Automorphic: " + isAutomorphic(testNumber));
        System.out.println(testNumber + " is Buzz: " + isBuzz(testNumber));
    }
}
