// Assignment 2
// Parys Newman
// April 5, 2022
/* This program will allow a user to perform some type of operation (addition
   multiplication, subtraction, division) between two numbers.*/

import java.util.Scanner;

public class NewmanParys_Asgn2 {

	public static void main(String[] args) {
		
		// creating scanner for each variable type I'll be using
		Scanner scanDoub = new Scanner(System.in);
		Scanner scanChar = new Scanner(System.in);
		
		// getting two numbers for the operation
		System.out.print("Enter two integer numbers between 200 and 1000 separated\n"
				+ "by a space: ");
		double first,sec;
		first = scanDoub.nextDouble();
		sec = scanDoub.nextDouble();
		
		// getting the operation symbol
		System.out.print("Enter operation symbol (+, -, *, or /): ");
		char operator = scanChar.next().charAt(0);
		
		//creating variable for number after operation
		double newNum;
		
		// creating conditions for both numbers to be between 200 and 1000
		if (first >= 200 && sec >= 200) {
			if (first <= 1000 && sec <= 1000) {
				
				/* once numbers meet conditions the symbol must also meet
				   certain conditions to perform the operation for whatever
				   symbol is input by the user */
				switch (operator) {
				
					case '+':
						newNum = first + sec;
						System.out.printf("Evaluation: %.0f + %.0f = %.1f", first, sec, newNum); 
						break;
						
					case '-':
						newNum = first - sec;
						System.out.printf("Evaluation: %.0f - %.0f = %.1f", first, sec, newNum); 
						break;
						
					case '*':
						newNum = first * sec;
						System.out.printf("Evaluation: %.0f * %.0f = %.1f", first, sec, newNum); 
						break;
						
					case '/':
						newNum = first / sec;	
						System.out.printf("Evaluation: %.0f / %.0f = %.1f", first, sec, newNum); 
						break;
						
					// the error message for incorrect symbol
					default:
						System.out.print("Not valid operation symbol");
						break;
				}
			}
		}  
		// closing scanners
		scanDoub.close();
		scanChar.close();
	}

}
