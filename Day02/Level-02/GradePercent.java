import java.util.*;

class GradePercent{
	public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter physics marks");
        int physics = input.nextInt();
		System.out.println("Enter chemistry marks");
        int chemistry = input.nextInt();
		System.out.println("Enter maths marks");
        int maths = input.nextInt();
		
        int percent = (physics + chemistry + maths) / 3;
		
        if(percent >= 80){
			System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade A, Level 4 : above agency-normalized standards");
		}
		else if((percent >= 70) && (percent <= 79)){
		    System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade B, Level 3 : at agency-normalized standards");
		}
		else if((percent >= 60) && (percent <= 69)){
		    System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade C, Level 2 : below, but approaching agency-normalized standards");
		}
		else if((percent >= 50) && (percent <= 59)){
		    System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade D, Level 1 : well below agency-normalized standards");
		}
		else if((percent >= 40) && (percent <= 49)){
		    System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade E, Level 1 : too below agency-normalized standards");
		}
		else{
		    System.out.println("Average marks obtained is " + percent);
			System.out.println("Grade R, Remedial standards");
		}
	}
}