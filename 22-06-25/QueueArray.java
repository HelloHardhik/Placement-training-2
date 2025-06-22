import java.util.NoSuchElementException;

public class QueueArray {
    private int[] arr;
    private int front, rear, size, capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = size = 0;
        rear = capacity - 1;
    }

    public void enqueue(int data) {
        if (isFull()) throw new IllegalStateException("Queue full");
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue empty");
        int data = arr[front];
        front = (front + 1) % capacity;
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

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Dequeue: " + q.dequeue());
        q.enqueue(4);
        System.out.println("Front element: " + q.peek());
    }
}
