// Assignment 1
// Parys Newman     
// March 17, 2022
/* This program allows a user to input a customer ID number, quantity of an item, 
   the price, and discount. Once this information is input it will calculate and display
   the amount before and after the discount is applied. */

import java.util.Scanner;
public class NewmanParys_Assignment1 {

	
	public static void main(String[] args) {
		
		// Creata scanner for each variable type
		Scanner scanInt = new Scanner(System.in);
		Scanner scanDoub = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);
		
		// Create variable for customer ID and collect input
		System.out.print("Enter customer ID: ");
		int custid = scanInt.nextInt();
		
		// Create variable for price of item and collect input
		System.out.print("Enter unit price in decimal format (e.g. 3.5): ");
		double price = scanDoub.nextDouble();
		
		// Create variable for the amount of units and collect input
		System.out.print("Enter quantity: ");
		int quantity = scanInt.nextInt();
		
		//Create variable for the item name and collect input
		System.out.print("Enter product description: ");
		String description = scanStr.nextLine();
		
		//Create variable for the discount and collect input
		System.out.print("Enter discount in decimal format (e.g. .05): ");
		double discount = scanDoub.nextDouble();
		
		// Create variable for before and after the discount
		double befDis = price * quantity;
		double afterDis = befDis - befDis * discount;
		
		// Closing each scanner
		scanInt.close();
		scanDoub.close();
		scanStr.close();
		
		
		// Displaying the data that was input
		System.out.println();
		System.out.println("ORDER DATA: ");
		System.out.println("Customer ID: " + custid);
		System.out.printf("Unit Price: $%.2f\n", price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Product Description: " + description);
		System.out.println("Discount: " + discount);
		
		// Displaying the data after the calculations
		System.out.println();
		System.out.printf("Order total BEFORE discount: $%.2f\n", befDis);
		System.out.printf("Order total AFTER discount: $%.2f\n", afterDis);
		
		
		
	}
}
