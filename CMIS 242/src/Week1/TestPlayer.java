package Week1;

public class TestPlayer {

	public static void main(String[] args) {
		
		PlayerData.playerCount = 3;
		
		PlayerData p1 = new PlayerData("Joe", 6);
		PlayerData p2 = new PlayerData("P", 4);
		
		p1.display();
		p2.display();

	}

}
