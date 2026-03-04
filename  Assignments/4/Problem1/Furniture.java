package Problem1;

public class Furniture extends Product {
    Material material; // wood, plastic, steel
    double shippingCost; // Shipping cost

    Furniture(String productName, double price, Material material, double shippingCost) {
        if (material == null || material == Material.MAT_WOOD || material == Material.MAT_PLASTIC || material == Material.MAT_STEEL) {
            throw new IllegalArgumentException("Material cannot be null");
        }

        if (shippingCost < 0) {
            throw new IllegalArgumentException("Shipping cost cannot be negative");
        }

        if (productName == null || productName == "" || productName.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }

        super(productName, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + shippingCost;
    }

    @Override
    public String toString() {
        return String.format(
                "\n----- Furniture -----\n" +
                        "Product name: %s\n" +
                        "Price: %.2f\n" +
                        "Material: %s\n" +
                        "Shipping Cost: %.2f\n" +
                        "Final Price: %.2f",
                productName, price, material, shippingCost, getPrice()
        );
    }

}
