package methodOverriding;

public class Event {

//	Instance Variables
	private String eventName;
	private String participantName;
	private double registrationFee;
	
//	Constructor
	public Event( String eventName, String participantName ) {
		this.eventName = eventName;
		this.participantName = participantName;
	}
	
//	Method
	public void registerEvent() {
		if( this.eventName.equals("Singing")  ) {
			this.registrationFee = 8;
		} else if( this.eventName.equals("Dancing")  ) {
			this.registrationFee = 10;
		} else if( this.eventName.equals("DigitalArt")  ) {
			this.registrationFee = 12;
		} else if( this.eventName.equals("Acting")  ) {
			this.registrationFee = 15;
		} else {
			this.registrationFee = 0;
		}
	}
	
//	Getters and Setters
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getParticipantName() {
		return participantName;
	}
	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}
	public double getRegistrationFee() {
		return registrationFee;
	}
	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}
	
	
	

}
