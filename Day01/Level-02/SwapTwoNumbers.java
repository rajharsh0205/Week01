import java.util.*;
public class SwapTwoNumbers{
	public static void main (String args[]){
		
		System.out.println("Enter number1 and number2");
		Scanner sc = new Scanner(System.in);
		
		int number1 =sc.nextInt();
		int number2 = sc.nextInt();
		int temp;
		
		temp=number1;
		number1=number2;
		number2=temp;
		
		System.out.println("The swapped numbers are " + number1 + " and  " + number2);
		}}										