package inheritance;

public class PermanentEmployee extends Employee {

//	Instance Variables
	private double basicPay;
	private double hra;
	private float experience;
	
//	Constructor
	public PermanentEmployee( int empid, String name, double basicPay, double hra, float experience ) {
		super( empid, name );
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

//	Methods
    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }
    public void calculateMonthlySalary() {
    	int variablePay = 0;
    	if( this.experience < 3  ) {
    		variablePay = 0;
    	} else if( this.experience >= 3 && this.experience < 5 ) {
    		variablePay = 5;
    	} else if( this.experience >= 5 && this.experience < 10 ) {
    		variablePay = 7;
    	} else if( this.experience >= 10 ) {
    		variablePay = 12;
    	}
    	this.setSalary( this.basicPay + this.hra + variablePay);
    			
    }
	
//	Getters and Setters
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	

}
