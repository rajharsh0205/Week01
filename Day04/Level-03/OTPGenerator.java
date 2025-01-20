public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000); // Ensures a 6-digit number
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All OTPs are unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs and store them in an array
        for (int i = 0; i < otpArray.length; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        // Validate if the generated OTPs are unique
        boolean unique = areOTPsUnique(otpArray);
        if (unique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
