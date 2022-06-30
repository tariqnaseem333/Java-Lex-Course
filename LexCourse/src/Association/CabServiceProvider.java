package association;

public class CabServiceProvider {

	private String cabServiceName;
	private int totalCabs;
	private Driver driver;

	//	Constructor
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}

	//	Method
	public double calculateRewardPrice( Driver driver ) {
		double bonus = 0;
		if( cabServiceName.equalsIgnoreCase("Halo") ) {
			if( driver.getAverageRating() >= 4.5f && driver.getAverageRating() <= 5f) {
				bonus = 10*driver.getAverageRating();
			} 
			else if ( driver.getAverageRating() >= 4f && driver.getAverageRating() <= 4.5f ) {
				bonus = 5*driver.getAverageRating();
			}
		}
		else if ( cabServiceName.equalsIgnoreCase("Aber") ) {
			if( driver.getAverageRating() >= 4.5f && driver.getAverageRating() <= 5f) {
				bonus = 8*driver.getAverageRating();
			} else if ( driver.getAverageRating() >= 4f && driver.getAverageRating() <= 4.5f ) {
				bonus = 3*driver.getAverageRating();
			}
		}
		return Math.round(bonus);
	}

	//	Getters and Setters
	public String getCabServiceName() {
		return cabServiceName;
	}

	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}

	public int getTotalCabs() {
		return totalCabs;
	}

	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}




}
