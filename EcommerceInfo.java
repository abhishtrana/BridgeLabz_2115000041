import java.util.ArrayList;
import java.util.List;

class Product {
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

    @Override
    public String toString() {
        return name + " (ID: " + productId + "), Price: $" + price;
    }
}

class Customer {
    private String customerId;
    private String name;
    private List<Order> orders;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public Order placeOrder(String orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    public void displayOrders() {
        System.out.println("Orders placed by " + name + ":");
        for (Order order : orders) {
            order.displayOrder();
        }
    }
}

class Order {
    private String orderId;
    private Customer customer;
    private List<Product> products;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(" - " + product);
        }
    }
}

public class EcommerceInfo {
    public static void main(String[] args) {
        Product laptop = new Product("P001", "Laptop", 1200.0);
        Product smartphone = new Product("P002", "Smartphone", 800.0);
        Product headphones = new Product("P003", "Headphones", 150.0);

        Customer alice = new Customer("C001", "Alice");
        Customer bob = new Customer("C002", "Bob");

        Order order1 = alice.placeOrder("O001");
        order1.addProduct(laptop);
        order1.addProduct(headphones);

        Order order2 = bob.placeOrder("O002");
        order2.addProduct(smartphone);

        alice.displayOrders();
        bob.displayOrders();
    }
}
