package association;

public class Person {

//	instance variables
	private String personName;
	private int age;
	private String gender;
	private int numberOfTickets;
	
//	constructor method
	public Person(String personName, int age, String gender, int numberOfTickets) {
		this.personName = personName;
		this.age = age;
		this.gender = gender;
		this.numberOfTickets = numberOfTickets;
	}
	
	public void calculateMovieBill( Ticket t ) {
		float final_amt = numberOfTickets * t.getPricePerTicket();
		System.out.println("Total Bill for the Movie:- ");
		System.out.println("Amount to be paid:- " + final_amt);
	}

	
//	Getters and Setters
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	
	
	

}
