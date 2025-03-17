package dfs;

public class NoOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        char[][] grid1 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        System.out.println("Number of Islands: " + numIslands(grid));
        System.out.println("Number of Islands: " + numIslands(grid1));
    }

    public static int numIslands(char[][] grid) {
        int noOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    noOfIslands++;
                    dfsSearch(grid, i, j);
                }
            }
        }
        return noOfIslands;
    }

    private static void dfsSearch(char[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] == '0') {
            return;
        }
        grid[row][col] = '0';
        dfsSearch(grid, row - 1, col);
        dfsSearch(grid, row + 1, col);
        dfsSearch(grid, row, col - 1);
        dfsSearch(grid, row, col + 1);
    }
}
