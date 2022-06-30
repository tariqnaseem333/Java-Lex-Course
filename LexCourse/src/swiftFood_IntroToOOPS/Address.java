package swiftFood_IntroToOOPS;

public class Address {
	
//	instance variables
	private String doorNo;
	private String street;
	private String city;
	private int zipcode;
	
//	Constructor Method 
	public Address(String doorNo, String street, String city, int zipcode ) {
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	
//	Getters and Setters
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	

	
	
	

}
