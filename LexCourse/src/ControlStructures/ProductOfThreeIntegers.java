package ControlStructures;

public class ProductOfThreeIntegers {

	public static void main(String[] args) {
		
		int a = 7;
		int b = 2;
		int c = 9;
		
		int prod = 1;
		
		if( a == 7 ) {
			prod = b * c;
			System.out.println(prod);
		}  else if( b == 7 ) {
			prod = c;
			System.out.println(prod);
		}  else if( c == 7 ) {
			prod = -1;
			System.out.println(prod);
		}  else {
			prod = a * b * c;
			System.out.println(prod);
		}

	}

}
