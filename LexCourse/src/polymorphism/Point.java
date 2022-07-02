package polymorphism;

public class Point {
	
//	Instance Variable
	private double xCoordinate;
	private double yCoordinate;
	
//	Constructor
	public Point( double xCoordinate, double yCoordinate ) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
//	Methods
	public double calculateDistance() {
		double expression = Math.pow(xCoordinate, 2.0) + Math.pow(yCoordinate, 2.0);
		double distance = Math.sqrt(expression);
		return Math.round(distance*100.0)/100.0;
	}
	public double calculateDistance( Point point ) {
		double expression = Math.pow( (xCoordinate - point.getxCoordinate()), 2.0) + Math.pow((yCoordinate - point.getyCoordinate()), 2.0);
		double distance = Math.sqrt(expression);
		return Math.round(distance*100.0)/100.0;
	}


	
//	Getters and Setters
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
	
	
	

}
