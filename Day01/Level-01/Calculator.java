import java.util.*;
public class Calculator{
	public static void main(String args[]){
		
		System.out.println("Enter number1 and number2");
		Scanner sc= new Scanner(System.in);
		
		float number1=sc.nextFloat();
		float number2=sc.nextFloat();
		
		float resultAdd=number1+number2;
		float resultSubtraction= number1-number2;
		float resultMultiplication = number1* number2;
		float resultDivision= number1/number2;
		
		
		System.out.println("The addition,subtraction,multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + resultAdd + "," + resultSubtraction + "," + resultMultiplication + ",and " + resultDivision);
		
	}
}