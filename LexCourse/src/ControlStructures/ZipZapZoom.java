package ControlStructures;

import java.util.Scanner;

public class ZipZapZoom {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		
		if( num%15 == 0 ) {
			System.out.println("Zoom");
		} else if( num%5 == 0 ) {
			System.out.println("Zap");
		} else if( num%3 == 0 ) {
			System.out.println("Zip");
		} else {
			System.out.println("Invalid");
		}
		
		

	}

}
