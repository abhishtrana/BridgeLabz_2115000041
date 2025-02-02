public class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("E-Book Details:");
        System.out.println("ISBN: " + ISBN); // Public attribute from Book class
        System.out.println("Title: " + title); // Protected attribute from Book class
        // Can't access `author` directly since it's private in Book
        System.out.println("Author: " + getAuthor()); // Using getter method
        System.out.println("File Size: " + fileSize + " MB");
    }
}
