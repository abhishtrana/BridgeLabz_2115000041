class Book {
    private static String libraryName = "City Library";

    private String title;
    private String author;
    private final String isbn;

    // Constructor using 'this' to resolve ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn; // Final variable ensures unique identifier cannot be changed
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details with instanceof check
    public void displayBookDetails(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        book1.displayBookDetails(book1);
        book2.displayBookDetails(book2);

        Book.displayLibraryName();
    }
}
