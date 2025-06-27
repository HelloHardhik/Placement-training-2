import heapq

def dijkstra(graph, start):
    pq = [(0, start)]
    distances = {node: float("inf") for node in graph}
    distances[start] = 0

    while pq:
        current_dist, current_node = heapq.heappop(pq)

        if current_dist > distances[current_node]:
            continue

        for neighbor, weight in graph[current_node]:
            dist = current_dist + weight
            if dist < distances[neighbor]:
                distances[neighbor] = dist
                heapq.heappush(pq, (dist, neighbor))

    return distances