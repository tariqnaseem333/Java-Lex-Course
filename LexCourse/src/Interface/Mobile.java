package Interface;

public class Mobile {
	
//	Instance Variables
	private String name;
	private String brand;
	private String operatingSystemName;
	private String operatingSystemVersion;
	
//	Constructor
	public Mobile( String name, String brand, String operatingSystemName, String operatingSystemVersion ) {
		this.name = name;
		this.brand = brand;
		this.operatingSystemName = operatingSystemName;
		this.operatingSystemVersion = operatingSystemVersion;
	}
	
//	Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOperatingSystemName() {
		return operatingSystemName;
	}

	public void setOperatingSystemName(String operatingSystemName) {
		this.operatingSystemName = operatingSystemName;
	}

	public String getOperatingSystemVersion() {
		return operatingSystemVersion;
	}

	public void setOperatingSystemVersion(String operatingSystemVersion) {
		this.operatingSystemVersion = operatingSystemVersion;
	}
	

}
