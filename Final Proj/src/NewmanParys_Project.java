// Parys Newman
// May 11, 2022
// Final Project
/* This program allows a user to input customer data and for it to be stored
 * for future use. It allows the user to search customer data using ID and sales.
 */

import java.util.Scanner;
public class NewmanParys_Project {

	public static void main(String[] args) {
		Scanner inInt = new Scanner(System.in);
		Scanner inDoub = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);
		int choice = 0;
		int numCust;
		String custName;
		int custID;
		double sales;
		
		
		do {
			displayMenu(); //displays menu
			System.out.print("Enter your selection: ");
			choice = inInt.nextInt();
			System.out.println();
			
			switch (choice) { //allows customer to keep using menu until exit is chosen
			
				case 1: System.out.println("Enter number of customers you want to load: ");
						numCust = inInt.nextInt();
						System.out.println("Enter Customer's name: ");
						custName = inStr.nextLine();
						System.out.println("Enter customer's ID: ");
						custID = inInt.nextInt();
						System.out.println("Enter customer's total sales: ");
						sales = inDoub.nextDouble();
						loadCust(numCust, custName, custID, sales);
						break; //loads customer data
						
				
				case 2: System.out.println("Enter Customer's name: ");
						custName = inStr.nextLine();
						System.out.println("Enter customer's ID: ");
						custID = inInt.nextInt();
						System.out.println("Enter customer's total sales: ");
						sales = inDoub.nextDouble();
						break; //add new customer
					
				case 3: //displayCust(custName, custID, sales); 
					
				case 4: System.out.println();
						System.out.println("Enter customer ID: ");
						custID = inInt.nextInt();
						break;
					
				case 5: System.out.println();
						System.out.println("Enter the customer's lowest total sale: ");
						double lowSale = inDoub.nextDouble();
						System.out.println("Enter the customer's highest total sale: ");
						double highSale = inDoub.nextDouble();
						//findCust(lowSale, highSale);
						break;
					
				case 6: System.out.println("Thanks for using the program!");
						break;
					
			   default: System.out.println("Invalid input");
			   			break;
			
			} //end of switch
			
		} while (choice != 6);
		inInt.close();
		inStr.close();
		inDoub.close();
	}//end of main
	
	public static void displayMenu() { //the menu
		System.out.println();
		System.out.println("1. Load customer's data ");
		System.out.println("2. Add new customer ");
		System.out.println("3. Display all customers ");
		System.out.println("4. Retrieve specific customer's data ");
		System.out.println("5. Retrieve cutomers with total sales based on the range ");
		System.out.println("6. Exit ");
	}
	
	public static void loadCust(int n, String c, int d, double p) {
		Scanner inInt = new Scanner(System.in);
		Scanner inDoub = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);
			for(int x = 0; x <= n; x++) {
				System.out.println();
				int numCust = inInt.nextInt();
				System.out.println("Enter Customer's name: ");
				String custName = inStr.nextLine();
				System.out.println("Enter customer's ID: ");
				int custID = inInt.nextInt();
				System.out.println("Enter customer's total sales: ");
				double sales = inDoub.nextDouble();
				loadCust(numCust, custName, custID, sales);
			}
			inInt.close();
			inStr.close();
			inDoub.close();
	} //end of loading customer
	
	public static void displayCust(String c, int d, double p) {
		System.out.print(c);
		System.out.print(d);
		System.out.print(p);
	} //end of displaying customer
	
	public static void findCust(int f) {
		//if (f = custID) {
			System.out.println();
		}
	//}//end of customer ID locator
	
	public static void locateCust(double l, double h) {
		int sales = 0;
		if (l >= sales && sales <= h) {
		}
	} //end of sales locator
}
