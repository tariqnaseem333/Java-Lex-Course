package classDiagram;

public class MovieTicket {
	
	private int movieId;
	private int noOfSeats;
	final int costPerTicket = 20;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	
	
	public MovieTicket() {
	}
	
	public MovieTicket( int movieId, int noOfSeats ) {
		this.movieId = movieId;
		this.noOfSeats = noOfSeats;
	}
	
	
	public int calculateTotalAmount()  {
		int amount = this.costPerTicket * this.noOfSeats;
		double totalAmount = amount * ( 1 + 2/100.0 );
		int totalAmount2 = (int)Math.round(totalAmount);
		return totalAmount2;
	}
	
	
	
	

}
