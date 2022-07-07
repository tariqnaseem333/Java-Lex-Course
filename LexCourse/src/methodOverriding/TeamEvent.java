package methodOverriding;

public class TeamEvent extends Event {

//	Instance Variables
	private int noOfParticipants;
	private int teamNo;
	
//	Constructor
	public TeamEvent( String eventName, String participantName, int noOfParticipants, int teamNo ) {
		super( eventName, participantName );
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
//	Method
	public void registerEvent() {
		if( this.getEventName().equals("Singing")  ) {
			this.setRegistrationFee(4.0*this.noOfParticipants);
		} else if( this.getEventName().equals("Dancing")  ) {
			this.setRegistrationFee(6.0*this.noOfParticipants);
		} else if( this.getEventName().equals("DigitalArt")  ) {
			this.setRegistrationFee(8.0*this.noOfParticipants);
		} else if( this.getEventName().equals("Acting")  ) {
			this.setRegistrationFee(10.0*this.noOfParticipants);
		} else {
			this.setRegistrationFee(0);
		}
	}

//	Getters and Setters
	public int getNoOfParticipants() {
		return noOfParticipants;
	}
	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}
	public int getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}
	
	
	
	
}
