//Parys Newman
// April 25, 2022
// Discussion Week 6
// Converts your height in inches to centimeters

import java.util.Scanner;
public class NewmanParys_DiscWk6 {
	
	static public double inchesToCM() {
		
		final double CM_PER_IN = 2.54;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your height in inches: ");
		double inch = in.nextDouble();
		in.close();
		return inch*CM_PER_IN;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		//Calling the method
		System.out.print("Your height in centimeters is " + inchesToCM());
		
		in.close();
	}
}
