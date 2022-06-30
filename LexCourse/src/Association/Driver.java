package association;

public class Driver {
	
	private String driverName;
	private float averageRating;
	
//	Constructor
	public Driver(String driverName, float averageRating) {
		this.driverName = driverName;
		this.averageRating = averageRating;
	}
	
//	Method
    public String toString(){
        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
    }
	
//	Getters and Setters
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

}
