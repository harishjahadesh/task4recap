package Question5;

import java.util.Stack;

public class stack {
    private Stack<Integer> stack = new Stack<>();

    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed: " + element);
    }

    public void popElement() {
        if (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.println("Popped: " + element);
        } else {
            System.out.println("Stack is empty, cannot pop.");
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        stack stackOps = new stack();
        
        stackOps.pushElement(10);
        stackOps.pushElement(20);
        
        stackOps.popElement();
        
        System.out.println("Is stack empty? " + stackOps.isEmpty());
        
        stackOps.popElement();
        stackOps.popElement();
    }
}

