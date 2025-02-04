public class Product {
    // Static variable for discount
    private static double discount = 10.0; // Discount percentage shared by all products

    // Final variable to ensure unique productID (cannot be changed)
    private final int productID;

    // Private instance variables for product details
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; // productID is final, so it can only be assigned once
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Method to print product details if the object is an instance of Product
    public void printProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            double discountedPrice = product.price * (1 - discount / 100);
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Price: $" + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Discounted Price: $" + discountedPrice);
        } else {
            System.out.println("The provided object is not an instance of Product.");
        }
    }

    // Static method to display current discount
    public static void displayCurrentDiscount() {
        System.out.println("Current Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        // Create some products
        Product prod1 = new Product(101, "Laptop", 1000.00, 2);
        Product prod2 = new Product(102, "Headphones", 150.00, 5);

        // Display current discount
        Product.displayCurrentDiscount();

        // Display product details with discount
        prod1.printProductDetails(prod1); // Should print details with discount
        prod2.printProductDetails(prod2); // Should print details with discount

        // Update the discount and display product details again
        Product.updateDiscount(20.0);
        System.out.println("\nUpdated Discount:\n");
        Product.displayCurrentDiscount();
        prod1.printProductDetails(prod1); // Should print details with updated discount
        prod2.printProductDetails(prod2); // Should print details with updated discount
    }
}
