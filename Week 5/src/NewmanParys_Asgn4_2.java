//Parys Newman
//April 20, 2022
//Assignment 4
//Exercise 2

import java.util.Scanner;
public class NewmanParys_Asgn4_2 {

	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the value of n between 1 and 5: ");
		int size = in.nextInt();
		//System.out.println();
		
		for (int row = 1; row <= size*2-1; row++) {
				
			for (int col = 1; col <= size*2-1; col++) {
				if (col == 1) {
					System.out.print(size + " ");
				}
					else if (col == size*2-1) {
					System.out.print(size + " ");
					}
						else if ((row > 4 && row < size*2 - 4) && (col > 4 && col < size*2 - 4)) {
						System.out.print(size - 4 + " ");
						}
							else if ((row > 3 && row < size*2 - 3) && (col > 3 && col < size*2 - 3)) {
							System.out.print(size-3 +" ");
							}
								else if ((row > 2 && row < size*2 - 2) && (col >2 && col < size*2 - 2)) {
								System.out.print(size-2 + " ");
								}
									else if ((row > 1 && row < size*2 - 1) && (col > 1 && col < size*2 - 1)) {
									System.out.print(size - 1 + " ");
									}
										else
										//System.out.print(size + " ");
											System.out.print(size + " ");
										
					
			}//end of inner loop
			System.out.println();
		}//end of outer loop
 in.close();
	}

}
