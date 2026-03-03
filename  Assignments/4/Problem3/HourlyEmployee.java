package Problem3;

public class HourlyEmployee extends Employee {
    double wage;
    double hours;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, double hours) {
        if (firstName == null || lastName == null || ssn == null) {
            throw new IllegalArgumentException("Employee information's required");
        }
        super(firstName, lastName, ssn);
        this.hours = hours;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    double getPayment() {
        return wage * hours;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "Wage: " + wage + "\n"
                + "Hours: " + hours + "\n"
                + "Payment: " + getPayment();
    }
}
