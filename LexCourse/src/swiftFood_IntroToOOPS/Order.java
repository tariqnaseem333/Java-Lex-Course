package swiftFood_IntroToOOPS;

public class Order {
	
	private int orderId;
	private Food[] orderedfoods;
	private double totalprice; 
	private String status;
	private String orderedFoods;
	private double totalPrice;
	private static int orderIdCounter;
	public static int count;
	
	static {
		orderIdCounter = 101;
		count = 0;
	}
	
//	Constructors
	public Order() {
	}
	public Order( Food[] orderedfoods ) {
		this.orderedfoods = orderedfoods;
	}
	public Order( int orderId, Food[] orderedfoods ) {
		this.status = "Ordered";
		this.orderId = orderIdCounter + (++count);
		this.orderedFoods = orderedFoods;
	}
	
//	Methods
	public double calculateTotalPrice(int unitPrice) {
		this.totalPrice = (double)unitPrice * ( 1 + ( 5/100.0 ) );
		return totalPrice;
	}
	
	public static int getTotalNoOrders() {
		return count;
	}
	
	public void displayOrderDetails() {
		System.out.println("Displaying order details \n***********");
		System.out.println("Order Id: " + orderId);
		System.out.println("Ordered Food: " + orderedFoods);
		System.out.println("Order Status: " + status);
		System.out.println("Total Price : " + totalPrice);
		System.out.println();
	}
	
//	Getters and Setters
	public Food[] getOrderedfoods() {
		return orderedfoods;
	}
	public void setOrderedfoods(Food[] orderedfoods) {
		this.orderedfoods = orderedfoods;
	}
	public double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}
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
	
	
	
}
