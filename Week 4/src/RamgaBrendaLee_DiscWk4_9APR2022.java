/* Week 4 Discussion - While Loop
 * BrendaLee Ramga
 * April 9, 2022
 * Program prompts user for input which  
 * to determine the number of loops 
 */
//package ramgabrendalee_discwk4_9apr2022;

import java.util.Scanner;   // Import Scanner

public class RamgaBrendaLee_DiscWk4_9APR2022 {
     
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        // Prompt user 
        System.out.print("For 'x' enter an integer bewteen 1 and 25: ");
        int x = scan.nextInt();
        
        do {
        	 System.out.println("Value of x: " + x);
             // Increment the value of x 
             x++;
        } while (x <= 25);
        scan.close();
        }
    }
     