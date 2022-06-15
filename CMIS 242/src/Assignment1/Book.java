package Assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
//attributes
	private	int id;
	private String title; //must allow multiple words
	private double price;
	
	//constructor
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	//
	private boolean isInvalidStr(String s) {
		if (s.isBlank() || s.isEmpty() || s == null) {
			return true;
		}
		return false;
	}
	
	public Book() { //might delete later
	}
	
	//new inventory class
	public class Inventory {
		//made an array list object with type book
		//using a generic to specify type
		 ArrayList<Book> library = new ArrayList<Book>(); 
		
		//add books

	}
	
	//create menu
	public void display() {
		System.out.println("\n    MENU");
		System.out.println("1: Add book");
		System.out.println("1: Remove book");
		System.out.println("1: Find book");
		System.out.println("1: Display all books");
		System.out.println("9: Exit program");
		System.out.println("Enter you selection: ");
	}
	
	public void choice() {
		Scanner in = new Scanner(System.in);
		int choice = 0;
		 do {
			 display();
			 choice = in.nextInt();
			 Inventory inventory = new Inventory();
			 
			 switch(choice) {
			//add book	 
			 case 1: inventory.library.add(null); //add correct args later
			 System.out.println("You have successfully added "); // add book title here
			 
			
			 //reomve book
			 case 2:

			 //find book by id
			 case 3:
			
			 //display all books
			 case 4:

			 //case occurs when any input other than 1-4 is given by user
			 default: System.out.println("Please enter a valid input");
			 }
			 
		 } while (choice != 9);
		 in.close();
	}
	// add some comment
	public void addBook(String id, String title, double price) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is the book ID (5 integers)? ");
		id = in.nextLine();
		// should i add if statement to check id?
		if (id.length() > 5) {
			System.out.println("Invalid ID length. ID must be 5 digits.");
			//return; //will return back to while loop
			//validate type of id
			if (isInvalidStr(id)) {
			System.out.println("Invalid ID. ID cannot be empty, null, or blank");
			//return; //will return back to while loop
			}
		}
		
		System.out.println("What is the book title? ");
		title = in.nextLine();
		
		System.out.println("What is the book price? ");
		price = in.nextDouble();
		
		//how to save this to an array?
		
		in.close();
	}
	
	public void removeBook (String id) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is book ID? ");
		id = in.nextLine();
		
		in.close();
	}
	
	


	//import Scanner.java.util;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Book book = new Book();
		

	}
}
