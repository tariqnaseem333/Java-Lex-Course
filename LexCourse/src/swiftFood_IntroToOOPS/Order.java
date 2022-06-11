package swiftFood_IntroToOOPS;

public class Order {
	
	private int orderId;
	private String orderedFoods;
	private String status;
	private double totalPrice;
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(String orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Order() {
		this.status = "Ordered";
	}
	
	public Order( int orderId, String orderedFoods ) {
		this.status = "Ordered";
		this.orderId = orderId;
		this.orderedFoods = orderedFoods;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = (double)unitPrice * ( 1 + ( 5/100.0 ) );
		return totalPrice;
	}
	
	public void displayOrderDetails() {
		System.out.println("Displaying order details \n***********");
		System.out.println("Order Id: " + orderId);
		System.out.println("Ordered Food: " + orderedFoods);
		System.out.println("Order Status: " + status);
		System.out.println("Total Price : " + totalPrice);
		System.out.println();
	}
	
	
}
