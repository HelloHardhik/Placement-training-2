import java.util.*;

public class DepthFirstSearch {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addEdge(int v, int w) {
        adj.computeIfAbsent(v, k -> new ArrayList<>()).add(w);
    }

    public void dfs(int v, Set<Integer> visited) {
        visited.add(v);
        System.out.print(v + " ");
        for (int n : adj.getOrDefault(v, new ArrayList<>())) {
            if (!visited.contains(n)) dfs(n, visited);
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch g = new DepthFirstSearch();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.print("DFS from 2: ");
        g.dfs(2, new HashSet<>());
    }
}
