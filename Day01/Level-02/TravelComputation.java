import java.util.*;
public class TravelComputation{
	public static void main (String args[]){
		
		System.out.println("Enter name, fromCity, viaCity, toCity");	
		Scanner sc = new Scanner(System.in);
		
		String name= sc.nextLine();
		String fromCity= sc.nextLine();
		String viaCity= sc.nextLine();
		String toCity= sc.nextLine();
		
		System.out.println("Enter distances fromToVia and viaToFinalCity in Miles");
		
		double distanceFromToVia=sc.nextDouble();
		double distanceViaToFinalCity=sc.nextDouble();
		
		System.out.println("Enter timeFromToVia and timeViaToFinalCity");
		int timeFromToVia = sc.nextInt();
		int timeViaToFinalCity=sc.nextInt();
		
		double totalDistanceMiles = distanceFromToVia + distanceViaToFinalCity;
		
		int totalTime = timeFromToVia + timeViaToFinalCity;
		
		
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistanceMiles + " miles " + " the Total Time taken is " + totalTime + " minutes");
	}}											