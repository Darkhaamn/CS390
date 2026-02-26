package Problem1;

public class main {
    void main() {
        System.out.println("------------------------------------------");
        System.out.println("Problem: 1 – Class & Objects");
        System.out.println("------------------------------------------");

        Customer customer1 = new Customer("Darkhanbayar", "Erdenebat", "12345678");
        customer1.setBillingAddress(new Address("1000N 4TH", "Fairfield", "IOWA", 52556));
        customer1.setShippingAddress(new Address("1000N 4TH", "Fairfield", "IOWA", 52556));

        Customer customer2 = new Customer("Lkhagvatuguldur", "Demberel", "22222222");
        customer2.setBillingAddress(new Address("123 Main St", "Chicago", "NY", 10001));
        customer2.setShippingAddress(new Address("123 Main St", "New York", "NY", 10001));

        Customer customer3 = new Customer("Turbat", "Bold", "3333333");
        customer3.setBillingAddress(new Address("123 N Michigan Ave", "Chicago", "IL", 60601));
        customer3.setShippingAddress(new Address("123 N Michigan Ave", "Chicago", "IL", 60601));

        Customer[] customers = new Customer[3];
        customers[0] = customer1;
        customers[1] = customer2;
        customers[2] = customer3;

        for (Customer cus: customers) {
            String cityName = cus.getBillingAddress().getCity();

            if (cityName.equals("Chicago")) {
                System.out.printf("\n%s's billing address is Chicago.", cus.getFirstName());
            }
        }
    }
}
