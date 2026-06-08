import java.util.ArrayList;

class RatinaMaze {

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        ArrayList<String> list = ratInMaze(maze);
        System.out.println(list);
    }

    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] vis = new boolean[n][n];
        solve(0, 0, maze, vis, "", ans);

        return ans;
    }

    private static void solve(int r, int c, int[][] maze, boolean[][] vis,
            String path, ArrayList<String> ans) {

        int n = maze.length;

        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        vis[r][c] = true;

        // D
        if (r + 1 < n && maze[r + 1][c] == 1 && !vis[r + 1][c]) {
            solve(r + 1, c, maze, vis, path + "D", ans);
        }

        // L
        if (c - 1 >= 0 && maze[r][c - 1] == 1 && !vis[r][c - 1]) {
            solve(r, c - 1, maze, vis, path + "L", ans);
        }

        // R
        if (c + 1 < n && maze[r][c + 1] == 1 && !vis[r][c + 1]) {
            solve(r, c + 1, maze, vis, path + "R", ans);
        }

        // U
        if (r - 1 >= 0 && maze[r - 1][c] == 1 && !vis[r - 1][c]) {
            solve(r - 1, c, maze, vis, path + "U", ans);
        }

        vis[r][c] = false; // backtrack
    }
}