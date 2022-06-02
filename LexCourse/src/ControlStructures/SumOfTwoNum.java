package ControlStructures;

public class SumOfTwoNum {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 6;
		int result = 0;
		
		if( num1 == num2 ) {
			result = num1 + num2;
			System.out.println(result);
		} else {
			result = 2* ( num1 + num2 );
			System.out.println(result);
		}

	}

}
