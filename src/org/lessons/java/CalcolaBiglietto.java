package org.lessons.java;

import java.util.Scanner;
import java.text.DecimalFormat;


public class CalcolaBiglietto {
	
	private static final DecimalFormat df = new DecimalFormat("0.00");
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numeri di km da percorrere: ");
		int km = in.nextInt();
//		System.out.println(km);
		
		System.out.print("Età: ");
		int età = in.nextInt();
//		System.out.println(età);
//		
		double prezzoBase = km * 0.21;
		System.out.print("Prezzo base: " + prezzoBase + "€ \n");
		
		if ( età < 18) {
//			sottraggo al prezzo base il 20% dello stesso
			double prezzoScontato = prezzoBase - prezzoBase / 5;
			System.out.print("prezzo scontato: " + df.format(prezzoScontato) + "€" );
			
		} else if (età > 65 ) {
//			sottraggo al prezzo base il 40% dello stesso
			double prezzoScontato = prezzoBase - (prezzoBase / 5) * 2;
			System.out.print("prezzo scontato: " + df.format(prezzoScontato) + "€" );
		}
		
	}
}
