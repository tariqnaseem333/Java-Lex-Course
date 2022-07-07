package Abstract;

public class CreditCardPayment extends Payment {
	
//	Instance Variables
	private static int counter;
	static {
		counter = 0;
	}
	
//	Constructor
	public CreditCardPayment( int customerId ) {
		super( customerId );
		this.setPaymentId("C100" + (++counter));
	}
	
//	Method
	public double payBill( double amount ) {
		double finalBill = 0;
		
		if( amount <= 500 ) {
			this.serviceTaxPercentage = 3.0;
		} else if( amount > 500 && amount <= 1000 ) {
			this.serviceTaxPercentage = 5.0;
		} else if( amount > 1000 ) {
			this.serviceTaxPercentage = 6.0;
		}
		
		finalBill = amount + amount*(this.serviceTaxPercentage/100.0);
		return finalBill;
	}

//	Getters and Setters
	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}
	
	

}
