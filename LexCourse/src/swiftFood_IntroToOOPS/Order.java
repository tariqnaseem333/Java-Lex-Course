package swiftFood_IntroToOOPS;

public class Order {
	
	public int orderId;
	public String orderedFoods;
	public String status;
	public double totalPrice;
	
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
