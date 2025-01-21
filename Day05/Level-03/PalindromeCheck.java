import java.util.Scanner;

public class PalindromeCheck {
	
    // Logic 1: Compare characters from start and end
    private static boolean isPalindromeByComparison(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
			}
            start++;
            end--;
		}
        return true;
	}
	
    // Logic 2: Recursive method to check palindrome
    private static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
		}
        
        if (str.charAt(start) != str.charAt(end)) {
            return false;
		}
        
        return isPalindromeRecursive(str, start + 1, end - 1);
	}
	
    // Logic 3: Compare original and reversed strings using char arrays
    private static boolean isPalindromeByReversal(String str) {
        char[] originalArray = str.toCharArray();
        char[] reversedArray = reverseString(str).toCharArray();
        
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
			}
		}
        return true;
	}
    
    // Method to reverse the string using charAt()
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
		}
        return reversed.toString();
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        boolean result1 = isPalindromeByComparison(str);
        System.out.println("Is the text palindrome Comparison Logic :" + result1);
        
        boolean result2 = isPalindromeRecursive(str, 0, str.length() - 1);
        System.out.println("Is the text palindrome Recursive Logic  :" + result2);
        
        boolean result3 = isPalindromeByReversal(str);
        System.out.println("Is the text palindrome Reversal Logic :" + result3);
        
        input.close();
	}
}
