public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        int length = text.length();
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null;
        try {
            // Attempt to call a method on a null reference
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Demonstrating NullPointerException
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception generated: " + e.getMessage());
        }

        // Handling NullPointerException
        handleNullPointerException();
    }
}
