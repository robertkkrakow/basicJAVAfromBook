package jpdp.zadania;

public class CastDemo_RzutowanieTypow {

	public static void main(String args[]) {
		
		double x = 10.0, y = 3.0;
		byte b;
		int i;
		char ch;
		
		//rzutowanie double na int obetnie czesc dziesietna z dzielenia x/y
		i = (int) (x / y);
		System.out.println("Calkowity wynik dzielenia x/y= " + i);
		
		i = 100;
		b = (byte) i;
		System.out.println("wartosc zmiennej b = " + b);
		
		i = 255;
		b = (byte) i;
		System.out.println("wartosc zmiennej b = " + b);
		
		//rzutowanie char na liczbe
		b = 88; //88 w ASCII odpowiada znakowi X wiec po rzutowaniu ch bedzie Xem
		ch = (char) b;
		System.out.println("ch: " + ch);
		
	}
	
}
