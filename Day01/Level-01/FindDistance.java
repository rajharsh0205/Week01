import java.util.*;
public class FindDistance{
	public static void main (String args[]){
		System.out.println("Enter Distance in Feet");
		Scanner sc = new Scanner(System.in);
		float distanceInFeet = sc.nextFloat();
		float distanceInMiles= distanceInFeet/5280;
		float distanceInYards = distanceInMiles * 1760;
		System.out.println(" The distance in feet is " + distanceInFeet + " in miles is " + distanceInMiles + " in yards is " + distanceInYards);
	}}			