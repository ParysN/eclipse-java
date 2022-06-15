//Parys Newman
//May 4, 2022
//Assignment 6
/* This program will allow a user to input their team's data
 * including their scores and names. The program will then identify
 * the teams with the highest and lowest scores.
 */

import java.util.Scanner;
public class NewmanParys_Asgn7 {
	
	public static void main(String[] args) {
		Scanner inInt = new Scanner(System.in);
		Scanner inStr = new Scanner(System.in);
		
		int[] nums = new int[1000];
		String[] names = new String[1000];
		
		System.out.print("How many teams do you want to enter: ");
		int teams = inInt.nextInt();
		
		//collect team's info
		for(int i = 0; i < teams; i++) { 
			System .out.println("Team " + (i+1) + ":");
			
			System.out.print("    Enter team's name: ");
			names[i] = inStr.nextLine();
			
			System.out.print("    Enter team's score (400-1000): ");
			nums[i] = inInt.nextInt();
			
		} //end of first for loop
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		//prints all the teams and their scores
		for(int p = 0; p < teams; p++) { 
			System.out.println(names[p] + " " + nums[p]);
		} //end of second for loop
		
		System.out.println();
		
		findHigh(nums,names,teams);
		findLow(nums, names, teams);
		
		
		
		
inInt.close();
inStr.close();
	}//end of main
	
	//finds the highest score
	public static void findHigh(int[] h, String[] n, int t) {
		int max = h[0];
		String name = n[0];
		for(int i = 1; i < t; i++)
			if (h[i] > max) { 
				max = h[i];
				name = n[i];
		}
		System.out.print("The " + name + " have the highest score => " + max);
	} //end of findHigh class
	
	//finds the lowest score
	public static void findLow(int[] L, String[] n2, int t) {
		int min = L[0];
		String name2 = n2[0];
		for(int i = 1; i < t; i++) {
			if (L[i] < min) 
				min = L[i];
				name2 = n2[i];
		}
		System.out.print(" and The "+ name2 + " have the lowest score => " + min);
	}//end of findLow class
	
}//end of public class
