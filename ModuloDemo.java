package jpdp.zadania;

public class ModuloDemo {

	public static void main(String args[]) {
		
		int iresult, irem;
		double dresult, drem;
		
		iresult = 10 / 3;
		irem = 10 % 3; //dzielenie modulo 
		
		dresult = 10.0 / 3;
		drem = 10 % 3;
		
		System.out.println("Wynik dzielenia z reszta z 10/3 = " + iresult + " reszta " + irem );
		System.out.println("Wynik dzielenia liczby zmiennoprzecinkowej 10/3 = " + dresult + " reszta modulo: " + drem);
		
	}
	
}
