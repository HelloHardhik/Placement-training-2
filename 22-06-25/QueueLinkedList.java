import java.util.NoSuchElementException;

public class QueueLinkedList {
    private Node front, rear;

    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear != null) rear.next = newNode;
        rear = newNode;
        if (front == null) front = rear;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        int data = front.data;
        front = front.next;
        if (front == null) rear = null;
        return data;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        QueueLinkedList q = new QueueLinkedList();
        q.enqueue(11);
        q.enqueue(22);
        System.out.println("Peek: " + q.peek());
        System.out.println("Dequeue: " + q.dequeue());
        System.out.println("Peek after dequeue: " + q.peek());
    }
}
