import java.util.EmptyStackException;

public class StackLinkedList {
    private Node head;

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop() {
        if (isEmpty()) throw new EmptyStackException();
        int data = head.data;
        head = head.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(5);
        stack.push(15);
        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek after pop: " + stack.peek());
    }
}
