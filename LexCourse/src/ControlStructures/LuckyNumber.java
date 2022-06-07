package ControlStructures;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {	

		int num, N, rem, sum, l, i, j, k;

//      Taking Input from the User
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();

//		Converting entered number from int to string
//		12345 to "12345"
		String str = String.valueOf(num);


//		Converting String number to String Array
//		"12345" to [ "1", "2", "3", "4", "5" ]
		String[] arr = str.split("");

//		Calculating length of the String Array
		l = arr.length;

		i = 0;
		rem = 0;
		sum = 0;
		N = num;
		while ( N > 0 ) {
			if( l%2 != 0 ) {
				if( i % 2 != 0 ) {
					rem = N % 10;
					sum = sum + (int)Math.pow(rem, 2);
				}
				i = i + 1; 
			} else {
				if( i % 2 == 0 ) {
					rem = N % 10;
					sum = sum + (int)Math.pow(rem, 2);
				}
				i = i + 1;
			}
			N = N / 10;
		}

		if ( sum%9 == 0 ) {
			System.out.println(num + " is an Lucky Number");
		} else {
			System.out.println(num + " is not a Lucky NUmber");
		}

	}
}
