// Discussion Week 3
// Parys Newman
// March 31, 2022
// This program prompts a user to input their age. Depending on their age they will get a certain message!

import java.util.Scanner;

public class NewmanParys_DiscWeek3 {

	public static void main(String[] args) {
		
		Scanner scanInt = new Scanner(System.in);
		
		System.out.print("How old are you?: ");
		int yourAge = scanInt.nextInt();
		
		if (yourAge == 24) {
			System.out.print("We're the same age!");
		} else {
			System.out.print("Dang, guess we're not the same age :(");
		}
			

	}

}
