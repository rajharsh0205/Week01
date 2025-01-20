import java.lang.*;
public class AreaOfTriangle{
	public static void main(String args[])
	{
		float base= 150;
		float height=20;
		
		float areaOfTriangle = (base*height)/2;
		float heightInCm = areaOfTriangle;
		
		double heightInInches= heightInCm*0.3937;
		double heightInFeet= heightInInches/12;
		
		System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
	}}	