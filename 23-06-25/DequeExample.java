import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.addFirst("Front");
        deque.addLast("Rear");
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());
    }
}
