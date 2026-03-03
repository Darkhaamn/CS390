package Problem1;

public class Electronics extends Product {
    int warranty; // month
    double warrantyCost; // warranty cost

    Electronics(String productName, double price, int warranty, double warrantyCost) {
        super(productName, price);

        if (warranty < 0) {
            throw new IllegalArgumentException("Warranty months cannot be negative");
        }

        if (warrantyCost < 0) {
            throw new IllegalArgumentException("Warranty cost cannot be negative");
        }

        this.warranty = warranty;
        this.warrantyCost = warrantyCost;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }

    @Override
    public String toString() {
        return String.format(
                "\n----- Electronics -----\n" +
                        "Product name: %s\n" +
                        "Price: %.2f\n" +
                        "Warranty: %d\n" +
                        "Warranty Cost: %.2f\n" +
                        "Final Price: %.2f",
                productName, price, warranty, warrantyCost, getPrice()
        );
    }
}
