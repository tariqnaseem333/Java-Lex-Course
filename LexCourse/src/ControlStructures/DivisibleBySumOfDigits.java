package ControlStructures;

import java.util.Scanner;

public class DivisibleBySumOfDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		int N = num;
		int sum = 0;
		int rem = 0;
		while( N > 0 ) {
			rem = N % 10;
			sum = sum + rem;
			N = N / 10;
		}
		
		if( num % sum == 0 ) {
			System.out.println(num + " is divisible by its sum of digits.");
		} else {
			System.out.println(num + " is not divisible by its sum of digits.");
		}

	}

}
