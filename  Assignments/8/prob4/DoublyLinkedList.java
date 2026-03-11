package prob4;

public class DoublyLinkedList {
    Node header;
    DoublyLinkedList(){
        header = new Node();
    }

    //1. adds to the end of the list
    public void addLast(String item){
        //implement
        Node newNode = new Node();
        newNode.value = item;
        Node temp = header;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.previous = temp;
    }

    // 2. Remove by passing object
    public boolean remove(String item){
        //Implement
        if (header.next == null) {
            return false;
        }

        Node current = header.next;
        while(current != null){
           if (current.value.equals(item)) {
               current.previous.next = current.next;

               if(current.next != null){
                   current.next.previous = current.previous;
               }
               return true;
           }
           current = current.next;
        }

        return false;
    }

    // 3. Remove the First Node
    public boolean removeFirst() {
        if(header.next == null) return false;

        Node first = header.next;
        header.next = first.next;

        if(first.next != null){
            first.next.previous = header;
        }
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        Node temp = header;

        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != header){
            System.out.print(temp.value + " ");
            temp = temp.previous;
        }

        System.out.println();
    }

    public int size(){
        int count = 0;
        if (header.next == null) {
            return count;
        }
        for (Node start = header.next; start != null; start = start.next ) {
            count++;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header);
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if(n==null) return;
        if(n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args){
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");

        // System.out.println(list);

        // System.out.println(list.size());
        // System.out.println(list.remove("Bob"));

        // System.out.println(list);
        // list.removeFirst();
        // System.out.println(list);
        // Call all your implemented Methods
        list.printReverse();
    }
}