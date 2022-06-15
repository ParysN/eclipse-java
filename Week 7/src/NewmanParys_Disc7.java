//Parys Newman
//Discussion Week 7
//This program multiplies each number in the array by 2

import java.util.Arrays;
public class NewmanParys_Disc7 {

	public static void main(String[] args) {
		
		int nums[] = {2, 13, 19, 98, 7, 43};
		
		System.out.println("The orginal array is " + Arrays.toString(nums));
		
		for (int i = 0; i < 1; i++) {

			byTwo(nums);
			System.out.println("The new array is " + Arrays.toString(nums));
		}

	}
	
	public static void byTwo(int p[]) {
		p[0] *=2;
		p[1] *=2;
		p[2] *=2;
		p[3] *=2;
		p[4] *=2;
		p[5] *=2;
	}

}
