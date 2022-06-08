package Methods;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		Calculator calc = new Calculator();
		double result = calc.findAverage(num1, num2, num3);
		System.out.println(result);

	}

}
