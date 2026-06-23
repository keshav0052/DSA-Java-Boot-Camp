class Solution {
    private int rows, cols;

    public void dfs(char[][] grid, int row, int col) {
        // boundries // base case
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != '1'){
            return;
        }
        grid[row][col] = '*';
        // visit all directions 
        // up 
        dfs(grid, row - 1, col);
        // down 
        dfs(grid, row + 1, col);
        // left 
        dfs(grid, row, col - 1);
        // right 
        dfs(grid, row, col + 1);
    }

    public int numIslands(char[][] grid) {
        rows = grid.length; 
        cols = grid[0].length;

        int islands = 0;
        for(int row = 0; row < rows; row++) {
            for(int col = 0; col < cols; col++) {
                if(grid[row][col] == '1'){
                    dfs(grid, row, col);
                    islands++;
                }
            }
        }
        return islands;
    }
}
