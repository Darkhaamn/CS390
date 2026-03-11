package prob2;

public class LinkedList {
    private Node header;
    private int size;

    public LinkedList() {
        header = new Node(null);
    }

    class Node {
        Integer data;
        Node prev;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
        Node(Node prev, Integer data, Node next){
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
    }

    public void push(Integer x) {
        if (x == null) return;

        Node nn = new Node(x);
        nn.prev = header;
        nn.next = header.next;
        if (header.next != null) {
            header.next.prev = nn;
        }
        header.next = nn;
        size++;
    }

    public Integer peek() {
        // take lastest integer
        if (isEmpty()) {
            return null;
        }

        return header.next.data;
    }

    public Integer pop() {
        // remove latest integer
        if (isEmpty()) return null;

        Node first = header.next;
        Integer data = first.data;

        header.next = first.next;
        if (first.next != null) {
            first.next.prev = header;
        }

        size--;
        return data;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public String toString() {
        StringBuilder ob = new StringBuilder("[");
        if (header.next == null) {
            return "[Empty List]";
        }
        else {
            Node curr = header.next;
            while (curr != null) {
                ob.append(curr.data);
                ob.append("==>");
                curr = curr.next;
            }
            ob.append("Null]");
        }

        return ob.toString();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push(1);
        ll.push(2);
        System.out.println(ll);
        System.out.println("Size :" + ll.size());
        System.out.println(ll.isEmpty());
        System.out.println(ll.peek());
        ll.pop();
        System.out.println(ll);
        ll.pop();
        System.out.println(ll);
    }
}
