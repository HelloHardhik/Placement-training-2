import java.util.NoSuchElementException;

public class CircularQueue {
    private int[] arr;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
        front = rear = -1;
    }

    public void enqueue(int data) {
        if ((rear + 1) % arr.length == front) throw new IllegalStateException("Queue full");
        if (isEmpty()) front = 0;
        rear = (rear + 1) % arr.length;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        int data = arr[front];
        if (front == rear) front = rear = -1;
        else front = (front + 1) % arr.length;
        size--;
        return data;
    }

    public int peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        System.out.println("Dequeue: " + cq.dequeue());
        cq.enqueue(40);
        System.out.println("Front: " + cq.peek());
    }
}
