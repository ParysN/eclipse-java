// Assignment 3
// Parys Newman
// April 10, 2022
/* This program collects a gamer's score for levels 1 - 3 and engagement
 * score to calculate their total XP score with a bonus per level. It'll
 * allow a user to input multiple gamer's information.
 */

import java.util.Scanner;
public class NewmanParys_Asgn3 {

	public static void main(String[] args) {
		String gamersName, play;
		int L1, L2, L3, ES;
		int XP;
		
		Scanner inStr = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		
		System.out.println("Welcome to the total XP calculation program!");
		System.out.println();
		System.out.print("Do you want to enter gamer's data? Yes/No => ");
		play = inStr.nextLine(); //storing value to begin program
		
		
		while (play.equalsIgnoreCase("yes")) { //if the user says yes we implement program
	
					System.out.print("Enter gamer's name => ");
					gamersName = inStr.nextLine(); //storing their name
			
					System.out.print("Enter gamer's Level XP scores separated by space:"
					+ " L1 L2 L3 ES => "); //getting gamer's scores for each level and engagement
					L1 = inInt.nextInt();
					L2 = inInt.nextInt();
					L3 = inInt.nextInt();
					ES = inInt.nextInt();
					
					//calculation to determine gamer's total XP score with bonus
					XP = (int) (L1 + (L1*0.20) + L2 + (L2*0.30) + L3 + (L3*0.50) + ES + (ES*0.60));
			
					System.out.println();
					System.out.println("Gamer Name: " + gamersName + " L1=" + L1 + " L2="
							+ L2 + " L3=" + L3 + " ES=" + ES);
					System.out.println("Final XP score with bonuses= " + XP);
					System.out.println();
					System.out.print("Do you want to enter another gamer's data? Yes/No => ");
					play = inStr.nextLine();
					
					while (play.equalsIgnoreCase("yes")) { /*if gamer wants to continue this will
						* loop until they don't want to enter anymore gamer's data
						*/
						System.out.print("Enter gamer's name => ");
						play = inStr.nextLine();
						
						System.out.print("Enter gamer's Level XP scores separated by space: "
								+ "L1 L2 L3 ES => ");
						L1 = inInt.nextInt();
						L2 = inInt.nextInt();
						L3 = inInt.nextInt();
						ES = inInt.nextInt();
						
						//calculation to determine gamer's total XP score with bonus
						XP = (int) (L1 + (L1*0.20) + L2 + (L2*0.30) + L3 + (L3*0.50) + ES + (ES*0.60));
						
						System.out.println();
						System.out.println("Gamer Name: " + gamersName + " L1=" + L1 + " L2="
								+ L2 + " L3=" + L3 + " ES=" + ES);
						System.out.println("Final XP score with bonuses= " + XP);
						System.out.println();
						System.out.print("Do you want to enter another gamer's data? Yes/No => ");
						play = inStr.nextLine();
						
					}
			}
			 if (play.equalsIgnoreCase("no")) { //whenever they want to stop this will print
				 System.out.println();
				System.out.print("Thank you for using the Total XP calculation program!");
				}
		inStr.close();
		inInt.close();
		}
						
}
		
