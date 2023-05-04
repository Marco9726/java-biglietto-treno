package org.lessons.java;

public class CibiPreferiti {
	public static void main(String[] args) {
		// Dichiaro un array di stringhe
		String[] cibiPreferiti = { 
				"Bufala",
				"Pollo fritto",
				"Carbonara",
				"Gricia", 
				"Margherita con salsiccia", 
				"Cacio e pepe", 
				"Cheescake" };
		
		System.out.print("Lunghezza array:" + cibiPreferiti.length + "\n");
		
		System.out.print("Cibo preferito: " + cibiPreferiti[0] + "\n");
		
		System.out.print("Cibo ultimo in classifica: " + cibiPreferiti[cibiPreferiti.length -1] + "\n");
		
		System.out.print("Cibo ultimo metà classifica: " + cibiPreferiti[cibiPreferiti.length / 2]);
	}
	
}
