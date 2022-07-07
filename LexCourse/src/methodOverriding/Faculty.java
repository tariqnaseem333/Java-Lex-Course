package methodOverriding;

public class Faculty {
	
//	Instance Variables
	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAllowancePercentage;
	
//	Constructor
	public Faculty( String name, float basicSalary ) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
//	Method
	public double calculateSalary() {
		double totalSalary = this.basicSalary + this.bonusPercentage + this.carAllowancePercentage;
		return totalSalary;
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getCarAllowancePercentage() {
		return carAllowancePercentage;
	}
	public void setCarAllowancePercentage(float carAllowancePercentage) {
		this.carAllowancePercentage = carAllowancePercentage;
	}
	public float getBonusPercentage() {
		return bonusPercentage;
	}
	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	
	

}
