import heapq

heap = []
nums = [1, 3, 5, 7, 9, 2]
for num in nums:
    heapq.heappush(heap, num)

while heap:
    print(heapq.heappop(heap))