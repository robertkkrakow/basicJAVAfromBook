package jpdp.zadania;

public class Charts {

	public static void main(String args[]) {
		
		int counter;
		char znak = 'X';
		
		//System.out.println("nasz znak to: " + znak);
		
		counter = 0;
		for(znak = 0; znak < 100; znak++) {
			System.out.println(znak);
			counter++;
			
			if(counter == 1) {
				System.out.println();
				counter = 0;
				}
		}
		
		/*
		znak++;
		System.out.println("a teraz nasz znak to: " + znak);
		
		znak++;
		System.out.println("a teraz nasz znak to: " + znak);
		*/
		
	}
	
}
