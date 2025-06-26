import heapq

pq = []
heapq.heappush(pq, (2, "Task 2"))
heapq.heappush(pq, (1, "Task 1"))
heapq.heappush(pq, (3, "Task 3"))

while pq:
    print(heapq.heappop(pq))