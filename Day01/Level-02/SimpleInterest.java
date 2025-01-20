import java.util.*;
public class SimpleInterest{
	public static void main (String args[]){
		
		System.out.println("Enter principal, rate, time ");
		Scanner sc = new Scanner(System.in);
		
		float principal =sc.nextFloat();
		float rate = sc.nextFloat();
		float time = sc.nextFloat();
		
		float simpleInterest = (principal*rate*time) / 100;
		
		System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + "years");
	}}	