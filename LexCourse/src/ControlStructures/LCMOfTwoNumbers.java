package ControlStructures;

import java.util.Scanner;

public class LCMOfTwoNumbers {
	
	public static int hCF(int num1, int num2) {
		int num;
		if( num1 > num2 ) {
			num = num2;
		} else {
			num = num1;
		}
		int hcf = Integer.MIN_VALUE; 
		int i = 1;
		while( i <= num ) {
			if( num1%i == 0 && num2%i == 0 ) {
				hcf = i;
			}
			i++;
		}
		return hcf;
	}

	public static void main(String[] args) {
		
//      Taking Input from the User
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		int hcf = hCF(num1, num2);
		
		int lcm = ( num1*num2 ) / hcf;
		
		System.out.println("The lcm of " + num1 + " and " + num2 + " is: " + lcm);
		
		

	}

}
