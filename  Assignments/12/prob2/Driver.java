package prob2;

public class Driver {
    void main() {
        CustomerAccount ca = new CustomerAccount("Darkhaa", "123", 2000);


        System.out.println("Balance amount: " + ca.getBalance());

        // System.out.println("Deposit -10$: " + ca.deposit(-10)); // Deposit amount must be positive
        // System.out.println("Withdraw 5000: " + ca.withdraw(5000)); // Insufficient funds! Withdrawal amount exceeds balance
        // System.out.println("Withdraw 1900: " + ca.withdraw(1900)); // Low balance warning! Balance cannot go below $100

        // Deposit
        System.out.println("Deposit 2000$: " + ca.deposit(1000));
        System.out.println("Withdraw 20: " + ca.withdraw(1500));

        System.out.println("Balance amount: " + ca.getBalance());
    }
}
