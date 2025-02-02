public class Book {
    public String ISBN; // Public: Accessible everywhere
    protected String title; // Protected: Accessible in the same package and subclasses
    private String author; // Private: Accessible only within this class

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author name
    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
