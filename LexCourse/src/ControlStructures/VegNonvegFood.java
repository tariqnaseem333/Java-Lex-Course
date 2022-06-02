package ControlStructures;

import java.util.Scanner;

public class VegNonvegFood {

	public static void main(String[] args) {

		char typeFood;
		int distance;
		int quantity;
		double billAmount = 1;
		Scanner s = new Scanner(System.in);


		System.out.println("Enter the Type of Food: ");
		typeFood = s.next().charAt(0);

		if( typeFood == 'V' ) {
			billAmount = 12;
		} else if( typeFood == 'N' ) {
			billAmount = 15;
		} 


		System.out.println("Enter the Quantity of plate: ");
		quantity = s.nextInt();

		billAmount = billAmount * quantity;


		System.out.println("Enter the distance ");
		distance = s.nextInt();

		if( distance > 0 && distance <= 3 ) {
			billAmount = billAmount;
		} else if ( distance > 3 && distance <= 6 ) {
			int i = 1;
			while( i <= (distance - 3) ) {
				billAmount = billAmount + 1;
				i++;
			}
		} else {
			int i = 1;
			billAmount = billAmount + 3;
			while( i <= (distance - 6) ) {
				billAmount = billAmount + 2;
				i++;
			}
		}

		System.out.println("The total cost for your order is: " + billAmount);

	}

}
