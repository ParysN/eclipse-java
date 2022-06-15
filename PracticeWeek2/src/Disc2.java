// Discussion week 2
// Parys Newman
// march 22, 2022
// Lets find out how old your doggy is in human years and how old you are in doggy years!

import java.util.Scanner;
public class Disc2 {

	public static void main(String[] args) {
		
		//creating scanner for input
		Scanner scanINT = new Scanner(System.in);
		
		//Getting doggy's age
		System.out.print("How old is your dog? (Only enter age 1 year and above): ");
		int dogAGE = scanINT.nextInt();
		
		//Getting your age
		System.out.print("How old are you?: ");
		int yourAGE = scanINT.nextInt();
		
		//Calculating ages
		int newDOGage = dogAGE*7;
		int yourNEWage = yourAGE/7;
		
		// Output
		System.out.println();
		System.out.println("WOW! Your doggy is " + newDOGage + "! That's pretty grown.");
		System.out.println("And you are " + yourNEWage + " in doggy years!");
		
	}

}
