// Book Class
public class Book {
    // Private attributes
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main Method to test the Book class
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 12.99);
        Book book2 = new Book("Atomic Habits", "James Clear", 15.99);

        System.out.println("=== Book 1 ===");
        book1.displayDetails();
        System.out.println("\n=== Book 2 ===");
        book2.displayDetails();
    }
}
