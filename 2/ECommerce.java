import java.util.ArrayList;
import java.util.List;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Electronics(String productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    public double calculateTax() {
        return getPrice() * taxRate;
    }

    public String getTaxDetails() {
        return "Tax Rate: " + taxRate;
    }
}

class Clothing extends Product implements Taxable {
    private double discountRate;
    private double taxRate;

    public Clothing(String productId, String name, double price, double discountRate, double taxRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
        this.taxRate = taxRate;
    }

    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    public double calculateTax() {
        return getPrice() * taxRate;
    }

    public String getTaxDetails() {
        return "Tax Rate: " + taxRate;
    }
}

class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return 0;
    }
}

class ECommerce {
    public static void calculateFinalPrices(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Final Price of " + product.getName() + ": " + finalPrice);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Laptop", 1000, 0.1, 0.15));
        products.add(new Clothing("C001", "T-Shirt", 20, 0.2, 0.05));
        products.add(new Groceries("G001", "Apple", 1));

        calculateFinalPrices(products);
    }
}
