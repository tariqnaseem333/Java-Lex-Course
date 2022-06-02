package Operators;

public class SimpleInterest {

	public static void main(String[] args) {
		
		int principal = 500;
		int rate = 10;
		int time = 5;
		
		double simpleInterest = ( principal * rate * time ) / 100;
		System.out.println(simpleInterest);

	}

}
