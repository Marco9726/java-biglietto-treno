package org.lessons.java;

public class FizzBuzz {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if ( i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(i);	
			}
		}
		
		System.out.println("---------------");
		
		//BONUS
		int x = 1;
		while ( x <= 100) {
			if ( x % 3 == 0 && x % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (x % 5 == 0) {
				System.out.println("Buzz");
			} else if (x % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(x);	
			}
			++x;
		}
	}
}
//		
//	}
