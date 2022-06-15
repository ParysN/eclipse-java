// Discussion week 4
// Parys Newman
// April 10, 2022
/* This program prompts a user to enter an odd number only.
 *  Once an even number is input you will get a funny
 *  message :) Once the user inputs a number it'll add 2 
 *  until it gets to 99.
 */
import java.util.Scanner;

public class NewmanParys_DiscWk4 {

	public static void main(String[] args) {
		Scanner scanIn = new Scanner(System.in);
		
		int inputNum;
		
		System.out.print("Enter an odd number between 1 - 99: ");
		inputNum = scanIn.nextInt();
		
		while (inputNum <= 99) { 
			System.out.println(inputNum);
			inputNum += 2;
		} if (inputNum < 1 && inputNum > 99) {
			System.out.print("You can't read directions!");
			
			} 	if (inputNum % 2 == 0){
			System.out.print("You can't read directions!");
		}
 scanIn.close();
	}

}
