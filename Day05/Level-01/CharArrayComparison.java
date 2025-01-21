import java.util.Scanner;

public class CharArrayComparison {
	
	public static char[] getCharsUsingCharAt(String input){
		char[] ch= new char[input.length()];
		for(int i=0; i<input.length(); i++){
			ch[i]= input.charAt(i);
		}
		return ch;
	}
	
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] a, char[] b){
		if(a.length!=b.length){
			return false;
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=b[i]){
				return false;
			}
		}
		return true;
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        // Taking user input
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
		
        // Getting characters using both methods
        char[] charsUsingCharAt = getCharsUsingCharAt(inputString);
        char[] charsUsingToCharArray = inputString.toCharArray();
		
        // Comparing the character arrays
        boolean areArraysEqual = compareCharArrays(charsUsingCharAt, charsUsingToCharArray);
		
        // Displaying the results
        System.out.println("Characters using custom method: ");
        System.out.println(charsUsingCharAt);
        System.out.println("Characters using toCharArray(): ");
        System.out.println(charsUsingToCharArray);
        System.out.println("Are both character arrays equal? " + areArraysEqual);
	}
}
