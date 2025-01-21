import java.util.Scanner;

public class AnagramChecker {
	
    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
		}
		
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];
		
        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i)]++;
		}
		
        for (int i = 0; i < str2.length(); i++) {
            frequency2[str2.charAt(i)]++;
		}
		
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
			}
		}
		
        return true;
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter the first text: ");
        String text1 = input.nextLine();
		
        System.out.print("Enter the second text: ");
        String text2 = input.nextLine();
		
        boolean result = areAnagrams(text1, text2);
		
        if (result) {
            System.out.println("The two texts are anagrams.");
			} else {
            System.out.println("The two texts are not anagrams.");
		}
		
	input.close();
    }
	}
		