class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> graph = new ArrayList<>();

        // Step 1: Build graph
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int d = road[2];

            graph.get(u).add(new int[]{v, d});
            graph.get(v).add(new int[]{u, d});
        }

        // Step 2: DFS
        boolean[] visited = new boolean[n + 1];
        return dfs(1, graph, visited);
    }

    private int dfs(int node, List<List<int[]>> graph, boolean[] visited) {
        visited[node] = true;
        int min = Integer.MAX_VALUE;

        for (int[] neighbor : graph.get(node)) {
            int next = neighbor[0];
            int dist = neighbor[1];

            // Take minimum edge
            min = Math.min(min, dist);

            if (!visited[next]) {
                min = Math.min(min, dfs(next, graph, visited));
            }
        }

        return min;
    }
}