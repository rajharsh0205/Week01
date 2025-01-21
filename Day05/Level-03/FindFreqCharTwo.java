import java.util.Scanner;

public class FindFreqCharTwo {
	
    private static char[] findUniqueCharacters(String str) {
        char[] result = new char[str.length()];
        int index = 0;
		
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (result[j] == currentChar) {
                    isUnique = false;
                    break;
				}
			}
            if (isUnique) {
                result[index++] = currentChar;
			}
		}
		
        char[] uniqueChars = new char[index];
		for (int i = 0; i < index; i++) {
            uniqueChars[i] = result[i];
		}
		
        return uniqueChars;
	}
	
    private static String[][] findCharacterFrequency(String str) {
        char[] uniqueChars = findUniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    frequency++;
				}
			}
            
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(frequency);
		}
        
        return result;
	}
	
    private static void displayCharacterFrequency(String[][] result) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("----------------------");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "        | " + result[i][1]);
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        String[][] result = findCharacterFrequency(str);
        
        displayCharacterFrequency(result);
        
        input.close();
	}
}
