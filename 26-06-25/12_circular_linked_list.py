class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.head = None

    def append(self, data):
        new_node = Node(data)
        if not self.head:
            self.head = new_node
            new_node.next = self.head
        else:
            cur = self.head
            while cur.next != self.head:
                cur = cur.next
            cur.next = new_node
            new_node.next = self.head

    def display(self):
        cur = self.head
        if not cur:
            return
        while True:
            print(cur.data, end=" -> ")
            cur = cur.next
            if cur == self.head:
                break
        print("HEAD")

cll = CircularLinkedList()
cll.append(10)
cll.append(20)
cll.display()