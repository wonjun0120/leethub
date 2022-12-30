class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(grid[r][c] == '1'){
                    grid = fill(grid, r, c);
                    result += 1;
                }
            }
        }
        
        return result;
    }
    
    public char[][] fill(char[][] grid, int sr, int sc){
        if(grid[sr][sc] == '1'){
            grid[sr][sc] = '2';
            if(sr + 1 < grid.length) grid = fill(grid, sr + 1, sc);
            if(sr - 1 >= 0) grid = fill(grid, sr - 1, sc);
            if(sc + 1 < grid[0].length) grid = fill(grid, sr, sc + 1);
            if(sc - 1 >= 0) grid = fill(grid, sr, sc - 1);
        }
        return grid;
    }
}