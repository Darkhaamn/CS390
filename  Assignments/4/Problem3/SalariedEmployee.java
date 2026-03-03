package Problem3;

public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        if (firstName == null || lastName == null || ssn == null) {
            throw new IllegalArgumentException("Employee information's required");
        }
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    double getPayment() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Weekly Salary: " + weeklySalary + "\n"
                + "Payment: " + getPayment();
    }
}
