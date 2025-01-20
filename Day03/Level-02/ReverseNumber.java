import java.util.*;

public class ReverseNumber{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
		long number = sc.nextLong();
		long originalNumber= number;
		int sizeOfNumber=0;
		while(number!=0){
			sizeOfNumber++;
			number/=10;
		}
		long[] reverseNumber= new long[sizeOfNumber];
		int index=0;
		while(originalNumber!=0){
			reverseNumber[index]= originalNumber%10;
			originalNumber/=10;
			index++;
		}
		
		System.out.println("Number in reverse using Array is: ");
		for(int i=0; i<sizeOfNumber; i++){
			System.out.print(reverseNumber[i]);
		}
	}
}