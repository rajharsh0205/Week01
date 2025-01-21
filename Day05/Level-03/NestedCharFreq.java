import java.util.Scanner;

public class NestedCharFreq {
	
    private static String[] findCharacterFrequency(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        String[] result = new String[length];
        int index = 0;
		
        for (int i = 0; i < length; i++) {
            char currentChar = charArray[i];
            if (currentChar == '0') {
                continue;
			}
            int frequency = 1;
            for (int j = i + 1; j < length; j++) {
                if (currentChar == charArray[j]) {
                    frequency++;
                    charArray[j] = '0';
				}
			}
            result[index++] = currentChar + " - " + frequency;
		}
		
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
		}
		
        return finalResult;
	}
	
    private static void displayCharacterFrequency(String[] result) {
        System.out.println("\nCharacter | Frequency");
        System.out.println("----------------------");
        for (String str : result) {
            System.out.println(str);
		}
	}
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter a string: ");
        String str = input.nextLine();
		
        String[] result = findCharacterFrequency(str);
		
        displayCharacterFrequency(result);
		
        input.close();
	}
}
