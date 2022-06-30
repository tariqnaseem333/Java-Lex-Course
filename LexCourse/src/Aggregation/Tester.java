package aggregation;

public class Tester {
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter Part-1", "JK Rowling");
        b1.setGenre("Fantasy");
        b1.setCost(59.5f);
        
        Book b2 = new Book("Harry Potter Part-2", "JK Rowling");
        b2.setGenre("Fantasy");
        b2.setCost(60f);
        
        Book b3 = new Book("Harry Potter Part-3", "JK Rowling");
        b3.setGenre("Fantasy");
        b3.setCost(65f);
        
        Book[] booksArray = { b1, b2, b3 };
        
        Library l1 = new Library("Central Library", 10, 1, booksArray);
        l1.displayLibDetails();
    }
}
