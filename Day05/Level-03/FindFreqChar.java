import java.util.Scanner;

public class FindFreqChar {

    private static String[][] findCharacterFrequency(String str) {
        int[] frequency = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
		     char ch = str.charAt(i);
		     if (ch >= 0 && ch <= 255) {
                frequency[ch]++;
            }
        }
        
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i); 
                result[index][1] = String.valueOf(frequency[i]); 
                index++;
            }
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
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        String[][] result = findCharacterFrequency(str);
        displayCharacterFrequency(result);
        
        sc.close();
    }
}
