package methodOverriding;

public class OfficeStaff extends Faculty {
	
//	Instance Variables
	private String designation;
	
//	Constructor
	public OfficeStaff( String name, float basicSalary, String designation ) {
		super( name, basicSalary );
		this.designation = designation;
	}
	
//	Method
	public double calculateSalary() {
		int addPay;
		if( this.designation.equals("Accountant") ) {
			addPay = 10000;
		} else if( this.designation.equals("Clerk") ) {
			addPay = 7000;
		} else if( this.designation.equals("Peon") ) {
			addPay = 1000;
		} else {
			addPay = 0;
		}
		double totalSalary = this.getBasicSalary() + this.getBonusPercentage() + this.getCarAllowancePercentage() + addPay;
		return totalSalary;
	}

//	Getters and Setters
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
