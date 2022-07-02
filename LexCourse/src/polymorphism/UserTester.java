package polymorphism;

public class UserTester {

	    public static void main(String[] args) {

	        User user = new User(101, "Joe", "joe@abc.com", 100);

			PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

			processPayment(user, 70);

			processPayment(premiumUser, 150);

			processPayment(premiumUser, 80);

			processPayment(premiumUser, 120);

	    }

	    public static void processPayment(User user, double billAmount) {
	        if (user.makePayment(billAmount)) {
				System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
			} else {
				System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
			}
			System.out.println("Your wallet balance is $" + user.getWalletBalance());

			if (user instanceof PremiumUser) {
				PremiumUser premiumUser = (PremiumUser) user;
				System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
			}
			System.out.println();
	    }


}
