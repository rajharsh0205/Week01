import java.util.*;
public class KilometerToMiles{
  public static void main(String args[]){
  
    System.out.println("Enter kilometers for convert");
	Scanner input= new Scanner(System.in);
	
    double km = input.nextDouble();
	double miles = (0.62137*km);
	
	System.out.println("The total miles is " + miles + " mile for the given " + km + "km"
);
  }}