package ControlStructures;

import java.util.Scanner;

public class MinNotes {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the no. of 1$ Notes: ");
		int x = s.nextInt();
		System.out.println("Enter the no. of 5$ Notes: ");
		int y = s.nextInt();
		System.out.println("Enter the Purchase Amount: ");
		int Amount = s.nextInt();
		
		int i = 1;
		while( i <= y ) {
			if( Amount < 5*i ) {
				break;
			}
			i++;
		}
		y = i - 1;
		Amount = Amount - 5*(i-1);

		int j = 1;
		while( j <= x ) {
			if( Amount < j ) {
				break;
			}
			j++;
		}

		x = j - 1 ;
		Amount = Amount - x;
		
		if ( Amount == 0 ) {
			System.out.println("1$ Notes Needed: " + x);
			System.out.println("5$ Notes Needed: " + y);
		} else {
			System.out.println("-1");
		}
		

	}

}
