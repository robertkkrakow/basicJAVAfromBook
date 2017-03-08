package jpdp.zadania;

/* zmiana galonów na litry */

public class GalToLitTable {
	
	public static void main(String args[]) {

	double gallons, liters; //definicja dwóch zmiennych gal i lit typu double
	int counter; //def zmiennej o nazwue counter i typie integer
	
	counter = 0;
		for(gallons = 1; gallons <= 20; gallons++) {
		liters = gallons * 3.7854;
		System.out.println(gallons + " galonów to: " + liters + " litrów");
	counter++;
	
		if(counter == 10) {
			System.out.println();
			counter = 0;
			}
	
		}
	
	}
}
