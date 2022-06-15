//package test;

//Discussion 3
//Zachary Rhodes
//3/30/2022
//tells you if one number is bigger than the other

import java.util.Scanner;

public class Disc3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        //input from the user
		System.out.println("first number: ");
		int num1 = scan.nextInt();
		System.out.println("second number: ");
		int num2 = scan.nextInt();
		
        //calculates if the number is bigger or not and outputs to screen
		if (num1 > num2) {
			System.out.println("first number is greater than the second number");
		}
		// my addition
		else if (num1 == num2) {
			System.out.println("first number is equal to second number");
		}
		
		else {
			System.out.println("second number is greater than the first number");
		}

		scan.close();
	}

}
