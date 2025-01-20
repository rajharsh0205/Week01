import java.util.*;
public class MaximumHandshakes{
	public static void main (String args[]){
		System.out.println("Enter N number of students");
		Scanner sc = new Scanner(System.in);
		
		int numberOfStudents = sc.nextInt();
		int possibleHandshakes=((numberOfStudents * (numberOfStudents - 1)) / 2);
		System.out.println("The number of possible handshakes is " + possibleHandshakes);
	}}					