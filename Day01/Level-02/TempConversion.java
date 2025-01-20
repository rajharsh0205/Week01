import java.util.*;
public class TempConversion{
	public static void main (String args[]){
		
		System.out.println("Enter temperature ");
		Scanner sc = new Scanner(System.in);
		
		float fahrenheit=sc.nextFloat();
		float celsiusResult =((fahrenheit-32) * 5/9);
		
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius" );
	}}										