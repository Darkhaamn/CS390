package Problem3;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName, String ssn, double grossSales, double commisionRate, double baseSalary) {
        if (firstName == null || lastName == null || ssn == null) {
            throw new IllegalArgumentException("Employee information's required");
        }
        super(firstName, lastName, ssn, grossSales, commisionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    double getPayment() {
        return baseSalary + super.getPayment();
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "SSN: " + socialSecurityNumber +"\n"
                + "Gross Sales: " + grossSales + "\n"
                + "Commission Rate: " + commisionRate + "%\n"
                + "Base Salary: " + baseSalary + "%\n"
                + "Payment: " + getPayment();
    }
}
