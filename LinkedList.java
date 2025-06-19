class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = newNode;
    }

    void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.append(1);
        llist.append(2);
        llist.append(3);
        llist.printList();
    }
}
