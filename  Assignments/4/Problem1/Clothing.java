package Problem1;

public class Clothing extends Product {
    String brand;
    double discount;

    Clothing(String productName, double price, String brand, double discount) {
        if (brand == null || brand == "") {
            throw new IllegalArgumentException("Brand cannot be empty");
        }

        if (discount < 0 || discount > 100) {
            throw new IllegalArgumentException("Discount must be between 0 and 100");
        }

        if (productName == null || productName == "") {
            throw new IllegalArgumentException("Product name cannot be empty");
        }

        super(productName, price);


        this.brand = brand;
        this.discount = discount;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discount / 100.0);
    }

    @Override
    public String toString() {
        return String.format(
                "\n----- Clothing -----\n" +
                        "Product name: %s\n" +
                        "Price: %.2f\n" +
                        "Brand: %s\n" +
                        "Discount: %.2f%%\n" +
                        "Final Price: %.2f",
                productName, price, brand, discount, getPrice()
        );
    }
}


