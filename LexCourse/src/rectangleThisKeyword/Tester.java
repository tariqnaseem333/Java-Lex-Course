package rectangleThisKeyword;

public class Tester {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle();
		double rectArea = rect.calculateArea(12f, 5f);
		double rectPerimeter = rect.calculatePerimeter(12f, 5f);
		
		System.out.println(rectArea);
		System.out.println(rectPerimeter);

	}

}

