import java.util.Scanner;

public class PracticeWeek3 {

	public static void main(String[] args) {
		
/*for (int x = 1; x <= 10; x++) {
	for (int y = 1; y <= 10; y++) {
		System.out.printf("%4d", x*y);
	}
	System.out.println();
}*/
		/*String fruit;
		for (int i = 0; i < fruit.length(); i++) {
			char letter = fruit.charAt(i);
			System.out.println(letter);
		}*/
		/* This program reads a sequence of positive integers input
		 * by user and it will print out the average of those
		 * integers. The user is prompted to enter one integer at a time. 
		 * Must enter a 0 to end the data. Zero isn;t counted. DOesn't
		 * check whether input is positive, so itll add both
		 */
		int inputNum;
		int sum = 0;
		int count = 0;
		double avg;
		
		Scanner scanIn = new Scanner(System.in);
		
		System.out.print("ENter first positivie integer: ");
		inputNum = scanIn.nextInt();
		
		while (inputNum != 0) { /* Since we want the loop to end once the user
		inputs 0 we're saying that until inputNum is 0 keep going*/
			//sum += inputNum; // add whatever inputNum is to sum
			//count++; //since we're getting avg this counts the number of 'numbers'
			// that are input by user
			System.out.print("Enter your next positive integer, 0 to end: ");
			inputNum = scanIn.nextInt();
		}
		System.out.print("the end");
		
		//DIsplay the result
		/*if (count == 0) {
			System.out.print("You didn't enter any data!");
		}
		else {
			avg = ((double)sum) / count; //making sum into double bc we dont want int division
			System.out.println();
			System.out.println("You entered " + count + " postivie integers.");
			System.out.printf("Their avg is %10.2f.\n", avg);
		}*/
		
		
scanIn.close();
	}
}
