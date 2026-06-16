import java.util.LinkedList;
import java.util.Queue;

public class NumberofIslands {
    public static void main(String[] args) {
        char[][] grid = {
                { '1', '1', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '1', '1', '1', '1' },
                { '1', '1', '1', '1', '1' }
        };

        System.out.println(numIslands(grid));

    }

    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && vis[i][j] == false) {
                    bfs(i, j, grid, vis);
                    dfs(i, j, grid, vis);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int i, int j, char[][] grid, boolean[][] vis) {
        vis[i][j] = true;
        if (i - 1 >= 0 && vis[i - 1][j] == false && grid[i - 1][j] == '1') {
            dfs(i - 1, j, grid, vis);
        }
        if (i + 1 < grid.length && vis[i + 1][j] == false && grid[i + 1][j] == '1') {
            dfs(i + 1, j, grid, vis);
        }
        if (j - 1 >= 0 && vis[i][j - 1] == false && grid[i][j - 1] == '1') {
            dfs(i, j - 1, grid, vis);
        }
        if (j + 1 < grid[0].length && vis[i][j + 1] == false && grid[i][j + 1] == '1') {
            dfs(i, j + 1, grid, vis);
        }

    }

    static class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private static void bfs(int i, int j, char[][] grid, boolean[][] vis) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = true;
        while (q.size() > 0) {
            Pair f = q.remove();
            int row = f.row;
            int col = f.col;
            // top [row - 1][col]
            if (row > 0) {
                if (vis[row - 1][col] == false && grid[row - 1][col] == '1') {
                    q.add(new Pair(row - 1, col));
                    vis[row - 1][col] = true;
                }
            }
            // bottom [row + 1][col]
            if (row + 1 < m) {
                if (vis[row + 1][col] == false && grid[row + 1][col] == '1') {
                    q.add(new Pair(row + 1, col));
                    vis[row + 1][col] = true;
                }
            }
            // left [row][col - 1]
            if (col > 0) {
                if (vis[row][col - 1] == false && grid[row][col - 1] == '1') {
                    q.add(new Pair(row, col - 1));
                    vis[row][col - 1] = true;
                }
            }
            // right [row][col - 1]
            if (col + 1 < n) {
                if (vis[row][col + 1] == false && grid[row][col + 1] == '1') {
                    q.add(new Pair(row, col + 1));
                    vis[row][col + 1] = true;
                }
            }
        }
    }
}
