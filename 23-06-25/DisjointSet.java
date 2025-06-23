public class DisjointSet {
    private int[] parent;

    public DisjointSet(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) parent[i] = i;
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y) {
        int xset = find(x);
        int yset = find(y);
        if (xset != yset) parent[yset] = xset;
    }

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(5);
        ds.union(0, 2);
        ds.union(4, 2);
        ds.union(3, 1);
        System.out.println(ds.find(4) == ds.find(0)); // true
        System.out.println(ds.find(1) == ds.find(0)); // false
    }
}
