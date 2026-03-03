package Problem3;

public class CommisionEmployee extends Employee {
    double grossSales;
    double commisionRate; // Percentage

    public CommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double commisionRate) {
        if (firstName == null || lastName == null || ssn == null) {
            throw new IllegalArgumentException("Employee information's required");
        }
        super(firstName, lastName, ssn);

        if (commisionRate < 0 || commisionRate > 100) {
            throw new IllegalArgumentException("Rate must be between 0 and 100");
        }
        this.grossSales = grossSales;
        this.commisionRate = commisionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    @Override
    double getPayment() {
        return grossSales * commisionRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Gross Sales: " + grossSales + "\n"
                + "Commission Rate: " + commisionRate + "%\n"
                + "Payment: " + getPayment();
    }
}
