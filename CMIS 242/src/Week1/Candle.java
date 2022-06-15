package Week1;

import java.util.Scanner;
public class Candle {
	
	String color;
	int height;
	double diameter;
	
	public Candle(String c, int h, double d) {
		this.color = c;
		this.height = h;
		this.diameter = d;
	}
	//method
	public static void displayMenu() {
	
		System.out.println();
		System.out.println("    MENU");
		System.out.println("1: Add Candle");
		System.out.println("2: Remove Candle");
		System.out.println("3: Light Candle");
		System.out.println("4: Extinguish Candle");
		System.out.println("5: Display Candles");
		System.out.println("9: Exit Program");
		
	}
	public static void addCandle() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is the candle's height?");
		int h = in.nextInt();
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int choice;
		do {
		System.out.println();
		displayMenu();
		choice = in.nextInt();
		
			switch(choice) {
			
			case 1 : 
			}
		
		
		}// end of do loop
		while (choice != 9);
	}

}
