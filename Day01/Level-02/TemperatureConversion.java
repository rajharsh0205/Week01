import java.util.*;
public class TemperatureConversion{
	public static void main (String args[]){
		
		System.out.println("Enter temperature ");
		Scanner sc = new Scanner(System.in);
		
		float celsius=sc.nextFloat();
		float farenheitResult=((celsius * 9/5) + 32);
		
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " fahrenheit" );
	}}									