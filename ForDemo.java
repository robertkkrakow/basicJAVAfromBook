package jpdp.zadania;

public class ForDemo {

	public static void main(String args[]) {
		
		int count; //definiujemy zmienna typu integer o nazwie count
		double licz;
		int mniej;
				
		for(count = 0; count < 11; count = count + 1) //inicjalizacja petli od 0, warunek czyli maksymalna liczba, iteracja czyli sposob zmiany wartosci zmiennej sterującej
			System.out.println("Wartość zmiennej sterującej count: " + count); //instrukcja
		
		/*
		 * pętla for
		 * 
		 * for(inicjalizacja; warunek; iteracja) 
		 * instrukcja;
		 * 
		 * count = count + 1 będziemy zapisywać jako count++
		 * 
		 */
		for(licz = -5; licz <= 5; licz++)
			System.out.println("Wartość zmiennej sterującej typu double licz: " + licz);
		
	
		
	}
	
}
