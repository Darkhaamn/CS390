package prob1;

import java.util.LinkedList;
import java.util.Queue;

public class prob1Test {
    void main() {
        System.out.println("Prob1");

        ArrayQueueImpl q = new ArrayQueueImpl(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("After enqueue 5 elements: " + q);
        System.out.println("Peek: " + q.peek());
        System.out.println("Size: " + q.size());

        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Dequeued: " + q.dequeue());

        System.out.println("Size: " + q.size());
        System.out.println(q);

        System.out.println("Peek: " + q.peek());
        System.out.println("Front: " + q.getFront());
        System.out.println("Rear: " + q.getRear());
    }
}
