package ControlStructures;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		
//		Check if number is ArmStrong or not
//		371, as 3^3 + 7^3 + 1^3 = 371
//		1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
		
		
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
        
        rem = 0;
        sum = 0;
        N = num;
        while ( N > 0 ) {
        	rem = N % 10;
        	sum = sum + (int)Math.pow(rem, l);
        	N = N / 10;
        }
        
        if ( sum == num ) {
            System.out.println(num + " is an ArmStrong Number");
        } else {
        	System.out.println(num + " is not an ArmStrong NUmber");
        }
        
	}
}
