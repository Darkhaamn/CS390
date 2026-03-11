package prob3;

import java.util.Stack;

public class BrowserHistory {
    String currentUrl;
    private Stack<String> backStack;
    private Stack<String> forwardStack;

    public BrowserHistory(String urlName) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentUrl = urlName;
    }

    public void visit(String url) {
        // push
        backStack.push(currentUrl);
        currentUrl = url;
        forwardStack.clear();

        System.out.println("Visited: " + url);
    }

    public void back() {
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }

        forwardStack.push(currentUrl);
        currentUrl = backStack.pop();

        System.out.println("Back to: " + currentUrl);
    }

    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }

        backStack.push(currentUrl);
        currentUrl = forwardStack.pop();

        System.out.println("Forward to: " + currentUrl);
    }
}
