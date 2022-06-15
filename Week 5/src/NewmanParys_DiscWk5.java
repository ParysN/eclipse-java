//Parys Newman
//Discussion Week 5
//April 15
/* This program allows a user to print a motivational message as many
 * they want to see it :)
 */

import java.util.Scanner;
public class NewmanParys_DiscWk5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		//the positive message
		System.out.print("Enter a positive message (ie. You got this!): ");
		String message = in.nextLine();
		//how many times you want to see it
		System.out.print("Now enter how many times you'd like to see it: ");
		int num = in.nextInt();
		//until the counter reaches num print their message
		for (int count = 1; count <= num; count++) {
			System.out.println(message);
		}
	in.close();	
	}
}
