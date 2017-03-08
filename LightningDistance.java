package jpdp.zadania;

import java.util.Scanner;


public class LightningDistance {

	static Scanner in = new Scanner(System.in);
	
	//obliczamy jak daleko uderzył piorun
	
	public static void main(String args[]) {
		
		double dist = 7.2*330;
		
		//dist = 7.2 * 330;
		
		//System.out.println("Piorun uderzył: " + dist + " metrów stąd");
		
		System.out.print("Ile sekund minęło od uderzenia pioruna = ");
		double sek = in.nextDouble();
		
		System.out.println("Piorun uderzył: " + sek*330 + " metrów stąd");
		
	}
	
}
