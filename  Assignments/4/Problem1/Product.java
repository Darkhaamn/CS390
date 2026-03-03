package Problem1;

public class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        if (productName == null) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public String toString() {
        return String.format(
                "\n----- Product -----\n" +
                        "Product name: %s\n" +
                        "Price: %.2f",
                productName, getPrice()
        );
    }


}
