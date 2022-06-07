package ControlStructures;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		String str = String.valueOf(num);
		String[] arr = str.split("");
		
		int len = arr.length - 1;
		
		int N1 = num;
		int N2 = 0;
		int rem = 0;
		int tens = (int)Math.pow(10, len);
		while( N1 > 0 ) {
			rem = N1 % 10;
			N2 = N2 + rem * tens;
			tens = tens / 10;
			N1 = N1 / 10;
		}  

		if( num == N2 ) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
