package Methods;

public class Calculator {
	
	public double findAverage( int num1, int num2, int num3 ) {
		
		double average = ( num1 + num2 + num3 ) / 3.0;
		double finalAverage = Math.round(average *100)  / 100.0;
		return finalAverage;
	}

}