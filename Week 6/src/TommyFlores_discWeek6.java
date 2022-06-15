//Program title: lesser of the two integers. 

//Programmer's name : Tommy Flores

//Date of last change : 26 April 2022

//Brief description. : Prompts user to enter two integers, the program then calls upon a method to calculate
// which is lower then returns the int and prints it for the user.

//package week6;
import java.util.Scanner;

public class TommyFlores_discWeek6 {

	public static int lesserOfTwo(int x, int y) {  // method runs the two ints and assigns the lesser to Z
		//then returns Z
		int z = x < y ? x : y;
		return z;}
	
	//my new addition
	public static int addition(int x, int y) {
		int p = x + y;
		return p;
	}
	public static void main(String[] args) {

		System.out.print("please enter two integers seperated by space:  ");
		Scanner scan = new Scanner(System.in); // loading in new scanner
		int x =scan.nextInt();  
		int y =scan.nextInt(); //scanning for x and y
		System.out.println(" the lesser of the two inetegers is :  " + lesserOfTwo(x,y));
		//the method is called at the end of the print statement letting the user know which program is the lesser of the two values.
		//my new addition
		System.out.println("The two integers added is " + addition(x,y));
		//closing scanner
		scan.close();

	}
}