package inheritance;

class ContractEmployee extends Employee {
	
//	Instance Variables
	private double wage;
	private float hoursWorked;
	
//	Constructor
	public ContractEmployee( int empId, String name, double wage, float hoursWorked ) {
		super( empId, name );
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
    
//  Methods
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    public void calculateSalary() {
    	this.setSalary(this.hoursWorked*this.wage);
    }
    
//  Getters and Setters
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
    
    
}
