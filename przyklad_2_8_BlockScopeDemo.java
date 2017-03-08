package jpdp.zadania;

public class przyklad_2_8_BlockScopeDemo {

	public static void main(String args[]) {
		
		int x; //deklaracja nowej zmiennej x o zasiegu globalnym
		
		x = 10;
		if(x == 10) { //tu bedzie popczatek zasiegu lokalnego dla nowej zmiennej y
			int y = 20;
			
			System.out.println("pokazujemy zmienne x i y: " + x + " " + y);
			x = y * 2;
			// System.out.println(y); - tutaj y sie jeszcze pokaze
			
		}
		
		System.out.println("x wynosi: " + x);
		// y ponizej sie nie pokaze bo obowiazuje tylko w petli if
		// System.out.println("y wynosi: "+ y);
	}
}
