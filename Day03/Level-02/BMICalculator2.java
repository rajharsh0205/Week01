import java.util.*;

class BMICalculator2{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of persons");
		int number = input.nextInt();
		
		double[][] personData = new double[number][3];
		String[] weightStatus = new String[number];
		
		for(int i=0; i<number; i++){
		System.out.println("Enter the weight(in Kg) and height(in m) of person " + (i+1));
		    for(int j=0; j<2; j++){
				personData[i][j] = input.nextDouble();
			}
			
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
			
			if(personData[i][2] <= 18.4){
				weightStatus[i] = "Underweight";
			}
			else if((personData[i][2] >= 18.5) && (personData[i][2] <= 24.9)){
				weightStatus[i] = "Normal";
			}
			else if((personData[i][2] >= 25.0) && (personData[i][2] <= 39.9)){
				weightStatus[i] = "Overweight";
			}
			else{
				weightStatus[i] = "Obese";
			}
			
			System.out.println("Height: " + personData[i][1] + ", weight: " + personData[i][0] + ", bmi: " + personData[i][2] + ", status: " + weightStatus[i]);
			System.out.println();
		}
		
		input.close();
	}
}