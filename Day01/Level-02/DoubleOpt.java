import java.util.*;
public class DoubleOpt{
	public static void main (String args[]){
		System.out.println("Enter a, b and c ");
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		double firstOperation=a + b *c;
		double secondOperation=a * b + c;
		double thirdOperation=c + a / 
		double fourthOperation=a % b + c;
		
		
		System.out.println("The results of Int Operations are " + firstOperation + "," + secondOperation + "," + thirdOperation + ", and " + fourthOperation);
	}}								