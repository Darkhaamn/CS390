package prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        ArrayList<Order> orders = new ArrayList<>();

        orders.add(new Order("O001", "Alice", 120.50));
        orders.add(new Order("O002", "Bob", 75.20));
        orders.add(new Order("O003", "Charlie", 210.00));
        orders.add(new Order("O004", "David", 89.99));
        orders.add(new Order("O005", "Emma", 150.75));
        orders.add(new Order("O006", "Frank", 65.40));
        orders.add(new Order("O007", "Grace", 340.00));
        orders.add(new Order("O008", "Henry", 99.95));
        orders.add(new Order("O009", "Ivy", 180.30));
        orders.add(new Order("O010", "Jack", 55.60));
        orders.add(new Order("O011", "Kevin", 1));
        orders.add(new Order("O012", "Laura", 2));
        orders.add(new Order("O013", "Mike", 3));
        orders.add(new Order("O014", "Nina", 4));
        orders.add(new Order("O015", "Oscar", 5));
        orders.add(new Order("O016", "Paul", 6));
        orders.add(new Order("O017", "Queen", 7));
        orders.add(new Order("O018", "Ryan", 8));
        orders.add(new Order("O019", "Sophia", 9));
        orders.add(new Order("O020", "Tom", 10));

        orders.add(new Order("O021", "Bob", 88.80));
        orders.add(new Order("O022", "Alice", 90.00));
        orders.add(new Order("O023", "Charlie", 75.50));
        orders.add(new Order("O024", "David", 60.20));

        Order lastOrder = new Order("O025", "Emma", 110.10);
        orders.add(lastOrder);

        System.out.println("Order removed: " + orders.remove(lastOrder));
        System.out.println("Size: " + orders.size());
        System.out.println("Getting order index of 5: " + orders.get(5));
        System.out.println("Updating order index of 5: " + orders.set(5, new Order("0032", "Darkhaa", 90)));
        System.out.println("Getting order index of 5: " + orders.get(5));

        orders.sort(Comparator
                .comparingDouble(Order::getTotalAmount)
                .thenComparing(Order::getCustomerName)
                .thenComparing(Order::getOrderId));

        System.out.println("\nSorted Orders (by totalAmount ascending):");
        for (Order o : orders) {
            System.out.println(o);
        }

        System.out.println("\ntotalAmount > 50.0");
        for (Order o : listMoreThan50(orders)) {
            System.out.println(o);
        }
    }

    public static List<Order> listMoreThan50(List<Order> list) {
        // return new ArrayList<>(...) with totalAmount > 50.0
        List<Order> nwOrder = new ArrayList<Order>();

        if (list == null || list.isEmpty()) {
            return nwOrder;
        }

        list.forEach(order -> {
            if (order.getTotalAmount() > 50.0) {
                nwOrder.add(order);
            }
        });

        nwOrder.sort(Comparator.comparing(Order::getCustomerName).thenComparing(Order::getTotalAmount));
        return nwOrder;
    }
}
