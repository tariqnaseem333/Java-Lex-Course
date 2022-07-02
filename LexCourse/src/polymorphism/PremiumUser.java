package polymorphism;

public class PremiumUser extends User {
	
//	Instance Variable
	private int rewardPoints;
	
//	Constructor
	public PremiumUser( int id, String userName, String emailId, double walletBalance ) {
		super( id, userName, emailId, walletBalance );
	}
	
//	Methods
	
	public boolean makePayment( double billAmount ) {
		boolean isSuccessful = super.makePayment(billAmount);
		if( isSuccessful ) {
			this.rewardPoints = (int)(0.1*billAmount);
			return isSuccessful;
		} else {
			return isSuccessful;
		}
	}

//	Getters and Setters
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	

}
