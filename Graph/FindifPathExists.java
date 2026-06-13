import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindifPathExists {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = { { 0, 1 }, { 1, 2 }, { 2, 0 } };
        int source = 0;
        int destination = 2;
        System.out.println(validPath(n, edges, source, destination));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination)
            return true;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0]; // 0
            int b = edge[1]; // 1
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean vis[] = new boolean[n];
        vis[source] = true;
        bfs(source, vis, adj, destination);

        return vis[destination];
    }

    private static void bfs(int start, boolean[] vis, List<List<Integer>> adj, int end) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int f = q.remove();
            for (int ele : adj.get(f)) {
                if (!vis[ele]) {
                    vis[ele] = true;
                    q.add(ele);
                    if (ele == end)
                        return;
                }
            }
        }
    }
}
