package Problem4;

public class Pizza {
    private PizzaSize pizzaSize;
    private PizzaType pizzaType;
    private int quantity;
    private double price;

    public Pizza(PizzaSize size, PizzaType type, int quantity) {
        this.pizzaSize = size;
        this.pizzaType = type;
        this.quantity = quantity;
    }

    private void calculatePrice() {
        double sizePrice = switch (pizzaSize) {
            case SMALL -> 8.0;
            case MEDIUM -> 10.0;
            case LARGE -> 12.0;
        };

        double typePrice = switch (pizzaType) {
            case VEGGIE -> 1.0;
            case PEPPERONI -> 2.0;
            case CHEEZE -> 1.5;
            case BBQCHICKEN -> 2.0;
        };

        this.price = (sizePrice + typePrice) * quantity;
    }

    public String printOrderSummary() {
        calculatePrice();

        double tax = price * 0.03;     // 3%
        double total = price + tax;

       return "Pizza Order:\n" +
                        "Size: " + pizzaSize.toString() + "\n" +
                        "Type: " + pizzaType.toString() + "\n" +
                        "Qty: " + quantity + "\n" +
                        "Price: $" + price + "\n" +
                        "Tax: $" + tax + "\n" +
                        "Total Price: $" + total + "\n";
    }
}
