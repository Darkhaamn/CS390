package Problem1;

public class TestClass {
    void main() {
        System.out.println("Problem 1: Product Pricing System\n");

        Product p1 = new Product("Apple", 2);
        Clothing p2 = new Clothing("Boots", 10.2, "Adidas", 10);
        Electronics p3 = new Electronics("Boiler", 10, 2, 5);
        Furniture p4 = new Furniture("Chair", 15, Material.MAT_WOOD, 4);
        Product p5 = new Product("IPhone", 499);

        Product[] products = {p1, p2, p3, p4, p5};

        for (Product p : products) {
            if (p != null) {
                System.out.println(p);
            }
        }

        System.out.printf("\nTotal products price: %.2f\n", sumProducts(products));
    }

    public static double sumProducts(Product[] col) {
        double sum = 0;

        if (col == null || col.length == 0) {
            return 0;
        }

        for (Product p : col) {
            if (p != null) {
                sum += p.getPrice();
            }
        }

        return sum;
    }
}
