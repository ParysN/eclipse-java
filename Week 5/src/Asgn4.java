import java.util.Scanner;

public class Asgn4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int size = in.nextInt();
		//System.out.println();
		
		for (int row = 1; row <= size*2-1; row++) {
			for (int col = 1; col <= size*2-1; col++) {
				if ((row <= size && col == size - row + 1 || col == size + row - 1) //left side
						|| (row >= size && col == row - size +1 || col == 2*size - (row - size +1)))
					System.out.print(size +  " ");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		in.close();
	}

}
