package Week2;

// Week 2 Discussion
// Parys Newman
// June 1, 2022 last modification
/* This program allows a user to enter product specifications
 * of an iPhone in the main method.
 */

public class WK2NewmanP { //iPhone class
	
	//attributes
	//instant variables
	private int type;
	private String color;
	
	//constructor
	public WK2NewmanP(int t, String c) {
		//setting values
		this.type = t;
		this.color = c;
	}
	
	//get methods
	public int getType() {
		return type;
	}
	public String getColor() {
		return color;
	}
	
	//set methods
	public void setType(int type) {
		this.type = type;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void display() {
		System.out.println("iPhone [type = " + type + ", color = " + color + "]");
	}

public static void main(String[] args) {
		
		WK2NewmanP p1 = new WK2NewmanP(11, "Gold");
		p1.display();
		
		WK2NewmanP p2 = new WK2NewmanP(8, "Rose Gold");
		p2.display();
	}

}

