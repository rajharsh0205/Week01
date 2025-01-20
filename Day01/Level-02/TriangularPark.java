import java.util.*;
public class TriangularPark{
	public static void main (String args[]){
		
		System.out.println("Enter side1,side2 and side3 in meters ");
		Scanner sc = new Scanner(System.in);
		
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		double perimeterOfTriangle =side1+side2+side3;
		double distanceToRun = 5000;
		double rounds = distanceToRun / perimeterOfTriangle;
		
		int totalRounds = (int) Math.ceil(rounds);
		
		System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km");
	}}												