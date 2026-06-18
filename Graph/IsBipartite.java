import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsBipartite {
    public static void main(String[] args) {

    }

    // 1 means red 2 means blue
    public static boolean isBipartite(int[][] graph) {
        int m = graph.length;
        boolean ans = true;
        int vis[] = new int[m];

        Arrays.fill(vis, -1);

        for (int i = 0; i < m; i++) {
            if (vis[i] == -1) {
                if (!(bfs(i, graph, vis)))
                    return false;
            }
        }
        return ans;
    }

    private static boolean bfs(int i, int[][] graph, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = 0;
        while (q.size() > 0) {
            int f = q.remove();
            int color = vis[f];
            for (int ele : graph[f]) {
                if (vis[ele] == vis[f]) {
                    return false;
                }
                if (vis[ele] == -1) {
                    vis[ele] = 1 - color;
                    q.add(ele);
                }
            }
        }
        return true;
    }

}
