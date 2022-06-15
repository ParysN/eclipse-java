
public class Restaurant {
	
	// attributes
		private int numTables;  	// how many tables it has
		public String name;			// name of the restaurant
		public String cuisine;	// What is the cuisine it specializes in
		private int reservations[];	// keeps track of reservations
		private int numReservations;	// number of current reservations
		
		// constructor
		public Restaurant(String name, String cuisine, int tables) {
			this.name = name;
			this.cuisine = cuisine;
			numTables= tables;
			reservations = new int[numTables];
			numReservations = 0;
		}
		
		// methods
		
		// method to add a new reservation
		public void makeReservation(int numGuests) {
			
			if (numReservations == numTables)
				System.out.println("We are sorry but we are already fully booked");
			else {
				reservations[numReservations] = numGuests;
				numReservations++;
				System.out.println("You have successfully reserved a table for " + numGuests + " guests");
			}
				
		}
		
		// method to display information about all reservations
		public void displayReservations() {
			
			System.out.println("Restaurant: " + name + " cuisine: " + cuisine);
			
			if (numReservations == 0)
				System.out.println("There are no reservations");
			else 	
				// print all data	
				for (int i=0; i < numReservations; i++)  
					System.out.println("Reservation " + (i+1) + ": Number of guests=" + reservations[i]);
		}
	}

