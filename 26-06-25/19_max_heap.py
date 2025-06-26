import heapq

heap = []
nums = [1, 3, 5, 7, 9, 2]
for num in nums:
    heapq.heappush(heap, -num)  # max-heap using negative numbers

while heap:
    print(-heapq.heappop(heap))