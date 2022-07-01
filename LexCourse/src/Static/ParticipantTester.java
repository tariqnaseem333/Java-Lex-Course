package Static;

public class ParticipantTester {
	
	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}

}
