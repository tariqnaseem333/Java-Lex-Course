package Static;

class Bill {

	private String billId;
	private String paymentMode;
	private static int count;

	static {
		count = 0;
	}

	public String getBillId() {
		return billId;
	}
	public void setBillId(String billId) {
		this.billId = billId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public static int getCount() {
		return count;
	}

	public Bill( String paymentMode  ) {
		this.paymentMode = paymentMode;
		this.billId = "B9001" + (++count);
	}

}



