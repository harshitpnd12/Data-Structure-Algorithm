import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList());
        System.out.println(canVisitAllRooms(rooms));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        vis[0] = true;
        dfs(rooms, 0, vis);
        // bfs(rooms, 0, vis);
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]) {
                return false;
            }

        }
        return true;
    }

    private static void dfs(List<List<Integer>> rooms, int i, boolean[] vis) {
        vis[i] = true;
        for (int ele : rooms.get(i)) {
            if (!vis[ele]) {
                dfs(rooms, ele, vis);
            }
        }
    }

    private static void bfs(List<List<Integer>> rooms, int start, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.remove();
            for (int ele : rooms.get(front)) {
                if (!vis[ele]) {
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }
}
