import java.util.LinkedList;
import java.util.Queue;

class Pair {
    int first;
    int second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class number_of_islands {
    void bfs(char[][] grid, int[][] vis, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        vis[row][col] = 1;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        int[] addRow = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] addCol = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (!q.isEmpty()) {
            int currentRow = q.peek().first;
            int currentCol = q.peek().second;
            q.remove();

            for (int i = 0; i < addRow.length; i++) {
                int nrow = currentRow + addRow[i];
                int ncolm = currentCol + addCol[i];

                if (nrow >= 0 && ncolm >= 0 && nrow < m && ncolm < n && grid[nrow][ncolm] == '1' && vis[nrow][ncolm] == 0) {
                    vis[nrow][ncolm] = 1;
                    q.add(new Pair(nrow, ncolm));
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int[][] vis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    bfs(grid, vis, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        number_of_islands solution = new number_of_islands();
        char[][] grid = {
            {'1','1','0','0'},
            {'1','1','0','0'},
            {'0','0','1','0'},
            {'0','0','0','0'},
            {'1','1','0','1'},
        };

        int numIslands = solution.numIslands(grid);
        System.out.println("Number of islands: " + numIslands); // Output should be 3
    }
}
