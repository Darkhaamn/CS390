package prob4;

public class TicketTest {
    void main() {
        System.out.println("Ticketing system");
        TicketingSystem ts = new TicketingSystem();

        ts.addTicket("Internet not working");
        ts.addTicket("Password reset");
        ts.addTicket("Payment failed");

        ts.viewNextTicket();
        ts.processTicket();
        System.out.println(ts.getQueueSize() + " tickets remaining");

        ts.viewNextTicket();
        ts.processTicket();
        System.out.println(ts.getQueueSize() + " tickets remaining");

        ts.viewNextTicket();
        ts.processTicket();
        System.out.println(ts.getQueueSize() + " tickets remaining");

        ts.processTicket();
        ts.viewNextTicket();
    }
}
