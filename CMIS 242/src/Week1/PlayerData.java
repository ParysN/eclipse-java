package Week1;

public class PlayerData {
	
	static int playerCount; //static class variable
	//associated with the actual class player data
	
	//instance attributes
	String name; //instance class variable
	int age; //these both will be associated with each object of this class
	
	//constructor
	public PlayerData(String name, int age) { 
		/*these parameters have to have the same name as the instance
		 * class variables above
		*/
		this.name = name;
		this.age = age;
	}
	
	//method
	public void display() {
		System.out.println("PlayerCount = " + playerCount + " name = " + name + ", age = "
				+ age);
	}

public static void main(String[] args) { //driver
		
		PlayerData.playerCount = 3;
		
		PlayerData p1 = new PlayerData("Joe", 6);
		PlayerData p2 = new PlayerData("P", 4);
		
		p1.display();
		p2.display();

	}
}
