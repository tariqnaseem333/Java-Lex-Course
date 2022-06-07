package ControlStructures;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		
//      Taking Input from the User
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int i = 1;
		while( i <= num ) {
			
			int j = 1; 
			while( j <= num - i + 1 ) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
