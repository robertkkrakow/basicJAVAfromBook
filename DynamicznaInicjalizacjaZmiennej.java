package jpdp.zadania;

import java.util.Scanner;

public class DynamicznaInicjalizacjaZmiennej {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String args[]) {
		
		
		System.out.print("Podaj promien walca: ");
		double r = in.nextDouble();
		
		System.out.print("Podaj wysokosc walca: ");
		double h = in.nextDouble();
		
		System.out.print("\n\tObjetosc walca wynosi: " + (3.1416 * r * r * h) + " cm3");
		
		
		
		/* z przykładu z ksiazki
		 
		
		double radius = 10, height = 5;
		
		//dynamiczna inicjalizacja zmiennej volume
		double volume = 3.1416 * radius * radius * height;
		
		System.out.println("Pojemnosc walca: " + volume);
		
		*/

		//a teraz zabawa ze skanerem
		
	}
	
}
