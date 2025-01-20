public class courseFee{
	public static void main(String args[])
	{
		int fee = 125000;
		int discountPercent = 10;
		float discount= (fee*discountPercent)/100;
		float amountToPay = (fee-discount);
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountToPay );
	}}	