package prob3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        // Basic operations (these will break when you add checks—students will add try/catch later)
        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        try {
            stack.push(40); // overflow
        } catch (IllegalStateException e) {
            System.out.println("Overflow caught: " + e.getMessage());
        }

        try {
            stack.push(null); // null not allowed
        } catch (NullPointerException e) {
            System.out.println("Null caught: " + e.getMessage());
        }

        System.out.println("Pop all elements:");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        try {
            stack.pop(); // underflow on pop
        } catch (EmptyStackException e) {
            System.out.println("Underflow caught on pop: stack is empty.");
        }

        try {
            stack.peek(); // underflow on peek
        } catch (EmptyStackException e) {
            System.out.println("Underflow caught on peek: stack is empty.");
        }

        System.out.println("Final Stack: " + stack);
    }
}
