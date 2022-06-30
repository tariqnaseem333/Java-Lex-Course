package aggregation;

public class Library {
	
    //instance variables
     private String libName;
     private int numberOfBooks;
     private int numberOfShelves;
     private Book[] booksArray;  //change1--> aggregation
	
	//methods
    public Library(String libName, int numberOfBooks, int numberOfShelves,Book[] booksArray ) {
        this.libName = libName;
        this.numberOfBooks = numberOfBooks;
        this.numberOfShelves = numberOfShelves;
        this.booksArray = booksArray;
    }    
    
    public void displayLibDetails() {
        
        System.out.println("Library Details:-");
        System.out.println("Library Name: "+ libName);
        System.out.println("Number Of Books: "+ numberOfBooks);
        System.out.println("Number Of Shelves: "+ numberOfShelves);
        for ( Book book : booksArray ) {
        	book.displayBookDetails();
        }        
    }
    
//    Getters and Setters
    public String getLibName() {
		return libName;
	}
	public void setLibName(String libName) {
		this.libName = libName;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
	public int getNumberOfShelves() {
		return numberOfShelves;
	}
	public void setNumberOfShelves(int numberOfShelves) {
		this.numberOfShelves = numberOfShelves;
	}
	public Book[] getBooksArray() {
		return booksArray;
	}
	public void setBooksArray(Book[] booksArray) {
		this.booksArray = booksArray;
	}
}
