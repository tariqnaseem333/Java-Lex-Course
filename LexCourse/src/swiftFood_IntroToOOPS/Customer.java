package swiftFood_IntroToOOPS;

import java.util.Scanner;

public class Customer {

	private String customerId;
	private String customerName;
	private long contactNumber;
	private Address address;  // Aggregation
	private static float deliveryCharge;
	
	static {
		deliveryCharge = 1.5f;
	}
	
//	Constructors
	public Customer() {
		
	}
	
	public Customer(String customerId, String customerName, long contactNumber, Address address) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
	public Customer(String customerName, long contactNumber, Address address) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	
//	Methods
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println("Delivery Charge: " + Customer.deliveryCharge);
		System.out.println();
	}
	

	public double payBill(double totalPrice) {
		double discountPercentage = 5;
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		double finalBillAmount = priceAfterDiscount + Customer.deliveryCharge;
		return finalBillAmount;
	}
	
//	Getters and Setters
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public static float getDeliveryCharge() {
		return deliveryCharge;
	}

	public static void setDeliveryCharge(float deliveryCharge) {
		Customer.deliveryCharge = deliveryCharge;
	}

}
