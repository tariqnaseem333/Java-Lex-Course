package ControlStructures;

import java.util.Scanner;

public class ChickenRabbit {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int legs = s.nextInt();
		int heads = s.nextInt();
		
		if( heads >= legs || legs%2 != 0 || heads == 0 ) {
		System.out.println("The numbers of Chickens and Rabbits cannot be found.");
		}
		else {
			int rabbitsCount = (int)( (legs - 2*heads) / 2 );
			int chickensCount = (int)( heads - rabbitsCount );
			System.out.println("Rabbits = " + rabbitsCount);
			System.out.println("Chickens = " + chickensCount);
		}

	}

}
