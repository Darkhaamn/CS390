package prob1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 10;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields
    // Default constructor
    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        size = 0;
        front = 0;
        rear = 0;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    // Parameterized to initialize instance fields
    public ArrayQueueImpl(int cap) {
        if (cap <= 0) {
            cap = DEFAULT_CAPACITY;
        }
        arr = new Integer[cap];
        size = 0;
        front = 0;
        rear = 0;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return arr[front];
    }

    public void enqueue(int obj) {
        if(size == arr.length){
            resize();
        }

        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (isEmpty()) return null;

        Integer removed = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        Integer[] newArr = new Integer[arr.length * 2];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }

        arr = newArr;
        front = 0;
        rear = size;
    }

    public String toString() {
        /* Return data in this format, each element separated by comma with in [ ] eg: [10, 20, 30, 40, 50, 60 ]*/
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            int value = arr[(front + i) % arr.length];

            sb.append(value);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
