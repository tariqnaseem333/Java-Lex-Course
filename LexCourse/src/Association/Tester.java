package association;

public class Tester {

	public static void main(String[] args) {
		
		Ticket t1 = new Ticket(101);
		t1.setMovieName("Avatar");
		t1.setPricePerTicket(100.00f);
		t1.setSeatNUmber(1);
		t1.setTiming("9 pm 03/06/2022");
		
		Person p1 = new Person( "Nikhil", 23, "Male", 4 );
		p1.calculateMovieBill(t1);

	}
	
}
