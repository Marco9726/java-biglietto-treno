package org.lessons.java;

import java.util.Scanner;


public class CalcolaBiglietto {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numeri di km da percorrere: ");
		int km = Integer.parseInt(in.nextLine());
		System.out.println(km);
		
		System.out.print("Età: ");
		int età = Integer.parseInt(in.nextLine());
		System.out.println(età);
//		
		double prezzoBase = km * 0.21;
		System.out.print("Prezzo base: " + prezzoBase);
		
		if ( età < 18) {
//			sottraggo al prezzo base il 20% dello stesso
			double prezzoScontato = prezzoBase - prezzoBase / 5;
			System.out.print("prezzo scontato: " + prezzoScontato);
			
		} else if (età > 65 ) {
//			sottraggo al prezzo base il 40% dello stesso
			double prezzoScontato = prezzoBase - (prezzoBase / 5) * 2;
			System.out.print("prezzo scontato: " + prezzoScontato);
		}
		
	}
}
