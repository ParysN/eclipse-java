import java.util.Scanner; //importing Scanner
//Scanner is used for input to be used in program

public class Echo {

	//import java.util.Scanner;
	public static void main(String[] args) {
		
		//import java.util.Scanner;
		
		String line;
		Scanner in = new Scanner(System.in);
		//this line is similar to int in = 8
		
		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said: " + line);
		
		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
	}

}
