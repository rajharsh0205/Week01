import java.util.*;
public class DivideChocolates{
	public static void main (String args[]){
		
		System.out.println("Enter numberOfchocolates and numberOfChildren");
		Scanner sc = new Scanner(System.in);
		
		int numberOfchocolates =sc.nextInt();
		int numberOfChildren = sc.nextInt();
		
		int chocolatesEachChildGets = numberOfchocolates/numberOfChildren;
		int remainingChocolates=numberOfchocolates%numberOfChildren;
		
		System.out.println("The number of chocolates each child gets is " + chocolatesEachChildGets + " and the number of remaining chocolates are " + remainingChocolates);
	}}											