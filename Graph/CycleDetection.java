import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class CycleDetection {

    public static void main(String[] args) {

        int V = 5;
        int[][] edges = {
                { 0, 1 },
                { 1, 2 },
                { 2, 3 },
                { 3, 4 },
                { 4, 1 }
        };

        if (isCycle(V, edges)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }

    public static boolean isCycle(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (bfs(i, adj, visited)) {
                    return true;
                }
                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean bfs(int start, ArrayList<ArrayList<Integer>> adj,
            boolean[] visited) {

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] { start, -1 });
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int parent = curr[1];

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[] { neighbor, node });
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}