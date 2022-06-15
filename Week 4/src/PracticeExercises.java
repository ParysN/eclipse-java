 import java.util.Scanner;
public class PracticeExercises {

	public static void main(String[] args) {
		// Exercise 1
		/*Scanner scanIn = new Scanner(System.in);
		
		int inputNum;
		int counter1 = 1;
		int counter2;
		
		System.out.print("Enter integer value: ");
		inputNum = scanIn.nextInt();
		
		while (counter1 <= inputNum) { // counts number of numbers input by user
			counter2 = 1;
			while (counter2 <= counter1) {
				System.out.print(counter2 + " ");
				counter2++;
			}
			System.out.println();
			counter1++;
		}*/
		
		//Exercise 2
		
		/*System.out.print("Enter two even integers separated by space: ");
		int firstNum = scanIn.nextInt();
		int secNum = scanIn.nextInt();
		
		int sum = firstNum + 2;
		
		while(sum < secNum) {
			System.out.println(sum);
			sum += 2;
		}*/
		//Exercise 3
		
		/*System.out.print("Enter 5 digit integer: ");
		int num = scanIn.nextInt();
		
		int lastDigit = 0;
		
		int reverse = 0;
		while (num > 0) {
			lastDigit = num % 10;
			reverse = (reverse * 10) + lastDigit;
			num = num / 10;
		}
		System.out.print(reverse);*/
		
		//Exercise 3
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int size = in.nextInt();
		System.out.println();
		
		for (int row = 1; row <= size*2-1; row++) {
			for (int col = 1; col <= size*2-1; col++) {
				if ((row <= size && col == size - row + 1 || col == size + row - 1) //left side
						|| (row >= size && col == row - size +1 || col == 2*size - (row - size +1)))
					System.out.print("* ");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		in.close();

	}

}
