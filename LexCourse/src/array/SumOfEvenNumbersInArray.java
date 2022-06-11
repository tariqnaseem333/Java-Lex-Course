package array;

import java.util.Scanner;

public class SumOfEvenNumbersInArray {
	
	public static int calculateSumOfEvenNumbers( int[] arr ) {
		int evenSum = 0;
		for( int i = 0; i < arr.length; i++ ) {
			if( arr[i] % 2 == 0 ) {
				evenSum = evenSum + arr[i];
			}
		}
		return evenSum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Length of Array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println("Enter the element at index: " + i);
			arr[i] = s.nextInt();
		}
		
		int sum = calculateSumOfEvenNumbers(arr);
		System.out.println(sum);
		

	}

}
