public class Practice2 {

	public static void main(String[] args) {
		//Exercise 2.2
		int hour = 14;
		int minute = 24;
		int second;
		
		//System.out.println(hour*3600 + minute*60);
		double secsAfterMidnight = hour*3600 + minute*60;
		//int secsRemaining = 3600*24 - secsAfterMidnight;
		//System.out.println(3600*24 - secsAfterMidnight);
		System.out.println(secsAfterMidnight/(3600*24)*100);
		
		

		
	}

}
