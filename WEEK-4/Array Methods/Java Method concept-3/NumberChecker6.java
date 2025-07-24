import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberChecker {

   
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    
    public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();
        for (int otp : otps) {
            otpSet.add(otp);
        }
        return otpSet.size() == otps.length;
    }

    
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP: " + otps[i]);
        }
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
