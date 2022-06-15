// Parys Newman
//April 27, 2022
//Assignment 5
/* This program gives user a menu of choices 1-3. To convert cubic feet to bushels, 
 * convert miles to kilometers, and determine graduation with honors title. The user
 * can exit the program at any time by pressing 9.
 */

import java.util.Scanner;
public class NewmanParys_Asgn5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int choice = 0;
		
		do { //begins loop for from program to keep going
			displayMenu(); //calls method to display options
		
			System.out.println();
			System.out.print("Enter your selection: ");
			choice = in.nextInt();
		
			switch (choice) { //any number that is chosen will determine the case
			
				case 1 : System.out.println();
					 	 System.out.print("    Enter cubic feet: ");
					 	 int cubFT = in.nextInt();
					 	 calcBushels(cubFT);
					 	 break;
					 
				case 2 : System.out.println();
						 System.out.print("    Enter miles: ");
						 int miles = in.nextInt();
						 calcKM(miles);
						 break;
					 
				case 3 : System.out.println();
						 System.out.print("    Enter GPA: ");
						 double GPA = in.nextDouble();
						 graduation(GPA);
						 break;
					 
				case 9 : System.out.println();
						 System.out.print("Thank you for using the program. Goodbye!");
						 break;
					 
				default : System.out.println();
					  	  System.out.println("Invalid input");
					  	  System.out.println();	 
			}
		} while (choice != 9);
		
in.close();
	}
	
	public static void displayMenu() {//displays menu to of options to choose from
		System.out.println();
		System.out.println("    MENU");
		System.out.println("1: Convert cubic feet to U.S. bushels");
		System.out.println("2: Convert miles to kilometers");
		System.out.println("3: Determine graduation title with honors");
		System.out.println("9: Exit program");
	}
	
	public static void calcBushels(int cf) { //converts cubic ft to bushels
		double bush = cf*0.803564;
		System.out.printf("    %d cubic ft. = %.5f U.S. bushels", cf, bush);
		System.out.println();
	}
	
	public static void calcKM(int m) { //converts miles to kilometers
		double kilM = m*1.60934;
		System.out.printf("    %d miles = %.4f km", m, kilM);
		System.out.println();
	}
	
	public static void graduation(double g) { //determines graduation with honors title
		
		if (g >= 3.5 && g <= 3.7) {
			System.out.println("    Congratulations, you have graduated Cum Laude!");
		} else if (g >= 3.8 && g <= 3.9) {
			System.out.println("    Congratulations, you have graduated Magna Cum Laude!");
			} else if (g >= 4.0) {
				System.out.println("    Congratulations, you have graduated Summa Cum Laude!");
				} else {
					System.out.println("    Invalid Input");
		}
	}

}
