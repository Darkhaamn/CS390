package prob4;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    private Queue<Ticket> queue;
    private int nextId;

    public TicketingSystem() {
        queue = new LinkedList<>();
        nextId = 1;
    }

    // This method should add a new ticket to the queue with a unique ID and the provided description
    public void addTicket(String description) {
        if (description == null || description.trim().isEmpty()) {
            System.out.println("Invalid ticket description");
            return;
        }
        Ticket t = new Ticket(nextId++, description);
        queue.offer(t);
        System.out.println("Added: " + t);
    }

    // This method should process (remove and return) the ticket at the front of the queue
    public Ticket processTicket() {
        if (queue.isEmpty()) {
            System.out.println("No tickets to process");
            return null;
        }

        Ticket t = queue.poll();
        System.out.println("Processed: " + t);

        if (queue.isEmpty()) {
            System.out.println("All tickets resolved. Thanks");
        }
        return t;
    }

    // This method should allow viewing the ticket at the front of the queue without removing it
    public Ticket viewNextTicket() {
        if (queue.isEmpty()) {
            System.out.println("No tickets in queue");
            return null;
        }

        Ticket t = queue.peek();
        System.out.println("Next: " + t);
        return t;
    }

    public int getQueueSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
