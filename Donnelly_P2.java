import java.util.*;

public class Donnelly_P2 {

	static double standardFormula(double weight, double height) {
		
		double w = weight;
		double h = height;
		
		double result = (w * 703) / (h * h);
		
		return result;
	}
	
	static double metricFormula(double weight, double height) {
		
		double w = weight;
		double h = height/100; // Convert centimeters to meters
		
		double result = ( w / (h * h) );
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		double n;
		double weight;
		double height;
		double result;
		
		System.out.println("Would you like to calculate BMI using the Standard System or the Metric System?");
		
		// Accepts input until the user chooses a formula
		
		do {
			
			System.out.println("Enter 1 for Standard System");
			System.out.println("Enter 2 for Metric System");
		
			n = scnr.nextDouble();
		
		}while(n != 1 && n != 2);
		
		if(n == 1) {
			
			System.out.println("Enter your weight in pounds: ");
			weight = scnr.nextDouble();
		
			System.out.println("Enter your height in inches: ");
			height = scnr.nextDouble();
		
			result = standardFormula(weight, height);
		}
		
		else{
			
			System.out.println("Enter your weight in kilograms: ");
			weight = scnr.nextDouble();
		
			System.out.println("Enter your height in centimeters: ");
			height = scnr.nextDouble();
			
			result = metricFormula(weight, height);
		}
		
		// Prints BMI result and the standard BMI categories for comparison
		
		System.out.println("\nBMI: " + result + "\n");
		
		System.out.println("BMI Categories:");
		System.out.println("Underweight = <18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");
		
		scnr.close();
	}

}
