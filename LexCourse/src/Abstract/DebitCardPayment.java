package Abstract;

public class DebitCardPayment extends Payment {
	
//	Instance Variables
	private static int counter;
	private double discountPercentage;
	static {
		counter = 0;
	}
	
//	Constructor
	public DebitCardPayment( int customerId ) {
		super( customerId );
		this.setPaymentId("D100" + (++counter));
	}
	
//	Method
	public double payBill( double amount ) {
		double finalBill = 0;
		
		if( amount <= 500 ) {
			this.serviceTaxPercentage = 2.5;
		} else if( amount > 500 && amount <= 1000 ) {
			this.serviceTaxPercentage = 2.5;
		} else if( amount > 1000 ) {
			this.serviceTaxPercentage = 5.0;
		}
		
		if( amount <= 500 ) {
			this.discountPercentage = 1.0;
		} else if( amount > 500 && amount <= 1000 ) {
			this.discountPercentage = 2.0;
		} else if( amount > 1000 ) {
			this.discountPercentage = 3.0;
		}
		
		finalBill = amount + amount*(this.serviceTaxPercentage/100.0) - (amount*this.discountPercentage/100.0);
		return finalBill;
	}
	
//	Getters and Setters
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	

}
