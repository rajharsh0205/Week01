import java.util.*;
public class universityFee{
	public static void main(String args[])
	{
		
		System.out.println("Enter fee and discount");
		Scanner sc = new Scanner(System.in);
		
        float fee = sc.nextFloat();
		float discountPercent = sc.nextFloat();
		float discount= (fee*discountPercent)/100;
		float amountToPay = (fee-discount);
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountToPay );
	}}		