
public class TestRestaurant {

		public static void main(String[] args) {
			
			// create new instance and display data
			Restaurant rest = new Restaurant("Great Wall of China", "Chinese", 2);
			rest.displayReservations();

			// add two reservations 
			System.out.println();
			rest.makeReservation(2);
			rest.makeReservation(3);
			
			// display data
			System.out.println();
			rest.displayReservations();
			
			// try adding reservation that exceeds capacity
			System.out.println();
			rest.makeReservation(2);
		}

}
