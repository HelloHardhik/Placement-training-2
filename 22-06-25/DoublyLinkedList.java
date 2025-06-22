public class DoublyLinkedList {
    private Node head, tail;

    private static class Node {
        int data;
        Node prev, next;
        Node(int data) { this.data = data; }
    }

    public void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        if (tail == null) tail = head;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void delete(int data) {
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current == null) return;
        if (current.prev != null) current.prev.next = current.next;
        else head = current.next;
        if (current.next != null) current.next.prev = current.prev;
        else tail = current.prev;
    }

    public void displayForward() {
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.data + " <-> ");
        }
        System.out.println("null");
    }

    public void displayBackward() {
        for (Node curr = tail; curr != null; curr = curr.prev) {
            System.out.print(curr.data + " <-> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(1);
        dll.insertEnd(2);
        dll.insertFront(0);
        System.out.print("Forward: ");
        dll.displayForward();
        System.out.print("Backward: ");
        dll.displayBackward();
        dll.delete(1);
        System.out.print("After deleting 1 forward: ");
        dll.displayForward();
    }
}
