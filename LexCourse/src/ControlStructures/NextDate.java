package ControlStructures;

import java.util.Scanner;

public class NextDate {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter Day of Date: ");
		int day = s.nextInt();
		System.out.println("Enter Day of Month: ");
		int month = s.nextInt();
		System.out.println("Enter Day of Year: ");
		int year = s.nextInt();

		int[] month31 = { 1, 3, 5, 7, 8, 10};
		for( int i = 0; i < month31.length; i++ ) {
			if( month31[i] == month && day == 31) {
				day = 1;
				month = month + 1;
			}
		}

		int[] month30 = { 4, 6, 9, 11 };
		for( int i = 0; i < month30.length; i++ ) {
			if( month30[i] == month && day == 30) {
				day = 1;
				month = month + 1;
			}
		}

		if( month == 2 && day == 28 && year%4 == 0 ) {
			day = day + 1;
		} 
		else if( month == 2 && day == 28 && year%4 != 0 ) {
			day = 1;
			month = month + 1;
		}
		else if( month == 2 && day == 29 ) {
			day = 1;
			month = month + 1;
		} else if( month == 12 && day == 31 ) {
			day = 1;
			month = 1;
			year = year + 1;
		} else {
			day = day + 1;
		}

		System.out.println(day + "-" + month + "-" + year);


	}

}
