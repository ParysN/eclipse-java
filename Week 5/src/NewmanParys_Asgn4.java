//Parys Newman
// Assignment 4
//April 17, 2022
/*Exercise 1 creates a triangle based on the number input
 * by the user
 */

import java.util.Scanner;
public class NewmanParys_Asgn4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//this number will determine how many rows
		//and what number it'll stop at
		System.out.print("Enter a number: ");
		int size = in.nextInt();
		
		//this first loop creates a counter that'll
		//help increment the next loop
		// while i<= the number put in by user then
		//continue to next loop
		for (int i = 1; i <= size; i++) {
			//while p<=i print out p + space
			//increment p if its not <= i move to outer loop
			for (int p = 1; p <= i; p++) {
				System.out.print(p + " ");
			}
			System.out.println(); //go to next line
		}
		in.close();
	}

}
