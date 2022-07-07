package Abstract;

public abstract class Payment {
	
//	Instance Variables
	private int customerId;
	protected String paymentId;
	protected double serviceTaxPercentage;
	
//	Constructor
	public Payment( int customerId ) {
		this.customerId = customerId;
	}
	
//	Method
	public abstract double payBill( double amount );
	
//	Getters and Setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public double getServiceTaxPercentage() {
		return serviceTaxPercentage;
	}

	public void setServiceTaxPercentage(double serviceTaxPercentage) {
		this.serviceTaxPercentage = serviceTaxPercentage;
	}
	

}
