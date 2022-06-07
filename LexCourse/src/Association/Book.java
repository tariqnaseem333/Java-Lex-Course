package Association;

public class Book {
    //instance variables
    private String bookName;
    private String authorName;
    private float cost;
    private String genre;
    
    public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
    
    //methods
    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }    
    public void displayBookDetails() {
        System.out.println("Book Details:-");
        System.out.println("Book Name: "+bookName);
        System.out.println("Author Name: "+authorName);
        System.out.println("Cost: "+cost);
        System.out.println("Genre: "+genre);
    }    
}
