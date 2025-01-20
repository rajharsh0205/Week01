import java.util.*;
public class FindTotalIncome{
	public static void main (String args[]){
		
		System.out.println("Enter salary and bonus ");
		Scanner sc = new Scanner(System.in);
		
		float salary =sc.nextFloat();
		float bonus = sc.nextFloat();
		float income =(salary+bonus);
		
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " Hence Total Income is INR " + income);
	}}											