public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default Constructor
    public Book2() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    // Parameterized Constructor
    public Book2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently not available.");
            return false;
        }
    }

    // Method to return a book
    public void returnBook() {
        isAvailable = true;
        System.out.println("You have successfully returned \"" + title + "\".");
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}
