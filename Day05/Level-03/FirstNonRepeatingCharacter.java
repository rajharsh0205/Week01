import java.util.Scanner;

public class FirstNonRepeatingCharacter {
	
    private static char findFirstNonRepeatingCharacter(String str) {
        int[] frequency = new int[256];
		
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
		}
        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == 1) {
                return str.charAt(i);
			}
		}
		
        return '\0';
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
		
        char result = findFirstNonRepeatingCharacter(str);
		
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
			} else {
            System.out.println("No non-repeating character found.");
		}
		
        sc.close();
	}
}
