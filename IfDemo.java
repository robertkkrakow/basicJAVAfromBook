package jpdp.zadania;

class IfDemo {

	public static void main(String args[]) {
		
		//deklaracja trzech zmiennych typu integer
		int a,b,c;
		
		//deklaracja wartości zmiennych
		a = 2;
		b = 3;
		c = a - b; //c będzie miało wartość -1
		
		System.out.println("a ma wartość: " + a + "\nb ma wartość: " + b + "\nc ma wartość: " + c);
		System.out.println();
		if (a < b) 
			System.out.println("a jest mniejsze od b");
		System.out.println();
		if (a == b) System.out.println("a = b - to nie będzie pokazane");
		System.out.println();
		if (c >= 0) System.out.println("C jest wieksze lub rowne zero - to nie bedzie pokazane");
		if (c <= 0) System.out.println("c jest mniejsze od zera");
		if (c != a) System.out.println("c różne od a i różne od b");
	
		
		
	}
}
