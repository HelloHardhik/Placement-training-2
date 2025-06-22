import java.util.*;

public class GraphAdjacencyList {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addVertex(int v) {
        adj.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int v, int w) {
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
        adj.computeIfAbsent(w, k -> new ArrayList<>()).add(v); // undirected
    }

    public List<Integer> getNeighbors(int v) {
        return adj.getOrDefault(v, Collections.emptyList());
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        visited.add(start);
        q.add(start);
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int n : getNeighbors(v)) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    q.add(n);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphAdjacencyList g = new GraphAdjacencyList();
        g.addVertex(0); g.addVertex(1); g.addVertex(2); g.addVertex(3);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        System.out.print("BFS from 0: ");
        g.bfs(0);
    }
}
