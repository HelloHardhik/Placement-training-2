import java.util.EmptyStackException;

public class StackArray {
    private int[] arr;
    private int top;
    private final int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int data) {
        if (top == capacity - 1) throw new StackOverflowError("Stack full");
        arr[++top] = data;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[top--];
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top after pop: " + stack.peek());
    }
}
