class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    public void display() {
        System.out.println(name + " (" + category + ") - Price: $" + price);
    }
}

class BookCategory {
}

class ClothingCategory {
}

public class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }

    public static void main(String[] args) {
        Product<BookCategory> book = new Product<>("Java Programming", 50, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20, new ClothingCategory());

        applyDiscount(book, 10);
        applyDiscount(shirt, 5);

        book.display();
        shirt.display();
    }
}
