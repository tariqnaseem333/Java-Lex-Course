package Interface;

public class Seller implements Tax {
	
//	Instance Variables
	private String location;
	private double taxPercentage;
	
//	Constructor
	public Seller( String location ) {
		this.location = location;
	}

//	Method
	@Override
	public double calculateTax(double price) {
		double taxAmount;
		if( this.location.equals("Middle East") ) {
			this.taxPercentage = 15.0;
		} else if( this.location.equals("Europe") ) {
			this.taxPercentage = 25.0;
		} else if( this.location.equals("Canada") ) {
			this.taxPercentage = 22.0;
		} else if( this.location.equals("Japan") ) {
			this.taxPercentage = 12.0;
		}
		taxAmount = price*(this.taxPercentage/100.0);
		
		return taxAmount;
	}

//	Getters and Setters
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	
	

}
