package Problem3;

public abstract class Employee {
    String firstName;
    String lastName;
    String socialSecurityNumber;

    Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = ssn;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\n"
                + "Last Name: " + lastName + "\n"
                + "SSN: " + socialSecurityNumber;
    }

    abstract double getPayment();
}
