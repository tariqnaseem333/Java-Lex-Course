package swiftFood_IntroToOOPS;

public class Restaurant {

	private String restaurantName;
	private long[] restaurantContacts;
	private String restaurantAddress;
	private float rating;
	
	public Restaurant() {
		
	}
	
	public Restaurant( String name, long[] restaurantContacts, String restaurantAddress, float rating ) {
		this.restaurantName = name;
		this.restaurantContacts = restaurantContacts;
		this.restaurantAddress = restaurantAddress;
		this.rating = rating;
	}
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public long[] getRestaurantContacts() {
		return restaurantContacts;
	}
	public void setRestaurantContact(long[] restaurantContacts) {
		this.restaurantContacts = restaurantContacts;
	}

	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}

	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	public void displayRestaurantDetails() {
		System.out.println("Displaying restaurant details \n***********");
		System.out.println("Restaurant Name: " + this.restaurantName);
		System.out.println("Restaurant Rating: " + this.rating);
		System.out.println("Restaurant Address: " + this.restaurantAddress);
		for (int index = 0; index < this.restaurantContacts.length; index++) {
			System.out.print(this.restaurantContacts[index] + "  ");
		}
		System.out.println();
	}

}
