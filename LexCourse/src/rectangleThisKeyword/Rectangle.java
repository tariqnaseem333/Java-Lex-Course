package rectangleThisKeyword;

public class Rectangle {
	
	public float length;
	public float width;
	
	public double calculateArea( float length, float width ) {
		double area = length * width;
		area = Math.round( area*100 ) / 100.0;
		return area;
	}
	
	public double calculatePerimeter( float length, float width ) {
		double perimeter = 2 * ( length + width );
		perimeter = Math.round( perimeter*100 ) / 100.0;
		return perimeter;
	}
	
	
}