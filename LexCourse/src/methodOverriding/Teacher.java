package methodOverriding;

public class Teacher extends Faculty {
	
//	Instance Variables
	private String qualification;
	
//	Constructor
	public Teacher( String name, float basicSalary, String qualification ) {
		super( name, basicSalary );
		this.qualification = qualification;				
	}
	
//	Method
	public double calculateSalary() {
		int addPay;
		if( this.qualification.equals("Doctoral") ) {
			addPay = 20000;
		} else if( this.qualification.equals("Masters") ) {
			addPay = 18000;
		} else if( this.qualification.equals("Bachelors") ) {
			addPay = 15500;
		} else if( this.qualification.equals("Associate") ) {
			addPay = 15500;
		} else {
			addPay = 0;
		}
		double totalSalary = this.getBasicSalary() + this.getBonusPercentage() + this.getCarAllowancePercentage() + addPay;
		return totalSalary;
	}
	
//	Getters and Setters
	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
	
	

}
