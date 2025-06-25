class Queue:
    def __init__(self):
        self.queue = []

    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if not self.is_empty():
            return self.queue.pop(0)

    def is_empty(self):
        return len(self.queue) == 0

    def display(self):
        print(self.queue)

q = Queue()
q.enqueue(1)
q.enqueue(2)
q.display()
q.dequeue()
q.display()