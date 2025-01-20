import java.util.*;
public class CalculateTotalPrice{
	public static void main (String args[]){
		System.out.println("Enter unitPrice and quantity");
		Scanner sc = new Scanner(System.in);
		
		float unitPrice = sc.nextFloat();
		float quantity = sc.nextFloat();
		float totalPrice= quantity*unitPrice;
		
		System.out.println("The total purchase price is INR " + totalPrice + "  if the quantity " + quantity + " and unit price is INR  " + unitPrice);
	}}				