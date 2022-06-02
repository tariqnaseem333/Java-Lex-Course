package TypeConversion;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		int fahrenheit = 50;
		
		double celsius = ( ( fahrenheit - 32 ) * 5 ) / 9;
		System.out.println(celsius);
	}

}
