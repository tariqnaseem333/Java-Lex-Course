package ControlStructures;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c = 4;
		
//		Roots
		double r1 = 0;
		double r2 = 0;
		
//		Discriminant
		double D = 0; 
		
		D = ( b * b ) - 4 * a * c;
		
		if( D == 0 ) {
			r1 = ( -b + D ) / ( 2* a );
			r2 = r1;
			System.out.println("Both roots are equal. They are: " + r1 + " " + r2);
		} else 	if( D > 0 ) {
			r1 = ( -b + D ) / ( 2* a );
			r2 = ( -b - D ) / ( 2* a );
			System.out.println("Roots are not equal.They are: " + r1 + " " + r2);
		} else {
			System.out.println("The equation has no real Roots");
		}

	}

}
