package jpdp.zadania;

public class Inch2Metr {

	public static void main(String args[]) {
		
		double inch, metr;
		int counter;
		
		counter = 0;
		for(inch = 1; inch <= 144; inch++) {
			metr = inch / 39.37;
			System.out.println(inch + " inch to: " + metr + " metrów");
		counter++;
		
		
		if(counter == 12) {
			System.out.println();
			counter = 0;
			}
		}
	}
	
}
