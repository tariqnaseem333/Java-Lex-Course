package finalKeyword;

public class Circle {
	
//	Instance Variables
	private final double PI = 3.14;
	private double diameter;
	private double circumference;
	private double area;
	
//	Constructor
	public Circle( double diameter ) {
		this.diameter = diameter;
	}
	
//	Method
	public void calculateCircumference() {
		this.circumference = this.PI*this.diameter;
	}
	public void calculateArea() {
		this.area = (this.PI*this.diameter*this.diameter)/4;
	}
	
//	Getters and Setters
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getCircumference() {
		return circumference;
	}
	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPI() {
		return PI;
	}
	
	

}
