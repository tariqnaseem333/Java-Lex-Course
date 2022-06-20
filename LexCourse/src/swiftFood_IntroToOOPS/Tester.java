package swiftFood_IntroToOOPS;

public class Tester {
	public static void main(String args[]) {
		
//		// Object creation
//		Customer customer = new Customer();
//		
//		// Displaying the customer details with default values
////		customer.displayCustomerDetails();
//		
//		// Assigning values to the instance variables
//		customer.customerId = "C101";
//		customer.customerName = "Stephen Abram";
//		customer.contactNumber = 7856341287L;
//		customer.address = "D089, St. Louis Street, Springfield, 62729";
//		
//		// Displaying the customer details with above values 
//		customer.displayCustomerDetails();
		

//		Customer customer2 = new Customer("John", 9812763456L, "California, USA");
//		
//		customer2.displayCustomerDetails();
		
		
//		Food food = new Food();
//
////		food.displayFoodDetails();
//
//		food.foodName = "Pizza";
//		food.cuisine = "Fast Food";
//		food.foodType = "Snack";
//		food.quantityAvailable = 12;
//		food.unitPrice = 25.05;
//
//		food.displayFoodDetails();
		
		
//		Order order = new Order();
//		
//		order.orderId = 101;
//		order.orderedFoods = "Pasta";
//		order.status = "ordered";
//		
//		order.calculateTotalPrice(34);
//		order.displayOrderDetails();
		
		
//		Restaurant res = new Restaurant();
//		
//		res.restaurantName = "McDonald's";
//		res.rating = 4.1f;
//		res.restaurantContact = 9832784502L;
//		res.restaurantAddress = "California, USA";
//		
//		res.displayRestaurantDetails();
		
		
		
		// Displaying the customer details with above values 
//		customer.displayCustomerDetails();
		
		
//		Order order = new Order();
//		System.out.println(order.status);
//		System.out.println();
//		
//		Order order2 = new Order( 1001, "Garlic Shrimp" );
//		order2.displayOrderDetails();
		
		
//		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
//		Restaurant restaurant1 = new Restaurant("SwiftFood",
//				restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
//		restaurant1.displayRestaurantDetails();
		
//		Addng Static variable deliveryCharge
		Customer customer1 = new Customer("C1001", "Sam", 9945000009L, "Carolina Street, Springfield, 62702");
		Customer.setDeliveryCharge(2f);
		System.out.println("Final amount to be paid: $" + customer1.payBill(20));
		Customer customer2 = new Customer("C1002", "John", 9645000009L, "Carolina Street, Springfield, 62708");
		System.out.println("Final amount to be paid: $" + customer2.payBill(15));
		System.out.println("Delivery Charge for the customers are: " + Customer.getDeliveryCharge());
		
	}
}
