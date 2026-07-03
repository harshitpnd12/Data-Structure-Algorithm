class Solution {
    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
        int n = online.length;

        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] indegree = new int[n];
        int maxCost = 0;

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            indegree[e[1]]++;
            maxCost = Math.max(maxCost, e[2]);
        }

        // Topological order
        int[] topo = new int[n];
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        int idx = 0;
        while (!q.isEmpty()) {
            int u = q.poll();
            topo[idx++] = u;

            for (int[] edge : graph[u]) {
                if (--indegree[edge[0]] == 0) {
                    q.offer(edge[0]);
                }
            }
        }

        int left = 0;
        int right = maxCost;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canReach(mid, graph, topo, online, k)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    private boolean canReach(int limit,
                             List<int[]>[] graph,
                             int[] topo,
                             boolean[] online,
                             long k) {

        int n = online.length;
        long INF = Long.MAX_VALUE / 4;

        long[] dist = new long[n];
        Arrays.fill(dist, INF);
        dist[0] = 0;

        for (int u : topo) {

            if (dist[u] == INF) continue;

            // Offline intermediate nodes cannot be used.
            if (u != 0 && u != n - 1 && !online[u]) continue;

            for (int[] edge : graph[u]) {
                int v = edge[0];
                int cost = edge[1];

                if (cost < limit) continue;

                if (v != 0 && v != n - 1 && !online[v]) continue;

                if (dist[u] + cost < dist[v]) {
                    dist[v] = dist[u] + cost;
                }
            }
        }

        return dist[n - 1] <= k;
    }
}