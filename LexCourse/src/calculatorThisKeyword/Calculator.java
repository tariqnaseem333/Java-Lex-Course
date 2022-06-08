package calculatorThisKeyword;

public class Calculator {
	
	public int num;
	
	public int sumOfDigits( int num ) {
		int sum = 0;
		int rem = 0;
		int N = num;
		while( N > 0 ) {
			rem = N % 10;
			sum = sum + rem;
			N = N / 10;
		}
		return sum;
	}

}
