import java.util.LinkedList;
import java.util.Queue;

class NumberOfProvinces {

    public static void main(String[] args) {
        int isConnected[][] = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        System.out.println(findCircleNum(isConnected));

    }

    public static int findCircleNum(int[][] adj) {
        int m = adj.length;
        int n = adj[0].length;
        boolean vis[] = new boolean[m];
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (!vis[i]) {
                dfs(adj, vis, i);
                // bfs(adj, vis, i);
                count++;
            }
        }
        return count;
    }

    private static void bfs(int[][] arr, boolean[] vis, int i) {
        Queue<Integer> q = new LinkedList<>();
        vis[i] = true;
        q.add(i);
        while (!q.isEmpty()) {
            int f = q.remove();
            for (int j = 0; j < arr.length; j++) {
                if (arr[f][j] == 1 && !vis[j]) {
                    q.add(j);
                    vis[j] = true;
                }
            }
        }
    }

    private static void dfs(int[][] arr, boolean[] vis, int i) {
        int n = vis.length;
        vis[i] = true;
        for (int j = 0; j < n; j++) {
            if (arr[i][j] == 1 && vis[j] == false) {
                dfs(arr, vis, j);
            }
        }
    }
}