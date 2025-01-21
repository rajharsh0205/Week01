import java.util.*;
public class IllegalArgumentException{
	public static void generateException(String input){
		String subString= input.substring(1,0);
	}
	public static void handleIllegalArgumentException(String input){
		try{
			String subString= input.substring(1,0);
		}
		catch(Exception e){
			System.out.println("IllegalArgumentException caught : " + e.getMessage());
		}
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Give any String: ");
		String input= sc.nextLine();
		try{
			generateException(input);
		}catch(Exception e){
			System.out.println("Exception is : " + e);
		}
		
		handleIllegalArgumentException(input);
		
		sc.close();
	}
}