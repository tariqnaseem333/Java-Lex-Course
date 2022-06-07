package ControlStructures;

import java.util.Scanner;

public class SeedOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int seed = s.nextInt();
		int num = s.nextInt();
		
		int N = seed;
		int mult = 1;
		int rem = 0;
		while( N > 0 ) {
			rem = N % 10;
			mult = mult * rem;
			N = N / 10;
		}
		
		if( seed * mult == num ) {
			System.out.println(seed + " is a seed of " + num);
		} else {
			System.out.println(seed + " is not a seed of " + num);
		}
		

	}

}
