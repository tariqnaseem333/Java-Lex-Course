package association;

public class Ticket {

//	instance variables
	private int ticketId;
	private int seatNUmber;
	private String movieName;
	private String timing;
	private float pricePerTicket;
	
//	Getters and Setters
	public Ticket ( int  ticketId ) {
		this.ticketId = ticketId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public int getSeatNUmber() {
		return seatNUmber;
	}

	public void setSeatNUmber(int seatNUmber) {
		this.seatNUmber = seatNUmber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public float getPricePerTicket() {
		return pricePerTicket;
	}

	public void setPricePerTicket(float pricePerTicket) {
		this.pricePerTicket = pricePerTicket;
	}
	
	

}
