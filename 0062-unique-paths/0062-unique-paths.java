/**
3 2
1 1 
1 2
1 3

3 7
1 1 1 1  1  1  1
1 2 3 4  5  6  7
1 3 6 10 15 21 28

*/

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0)
                    grid[i][j] = 1;
                else
                    grid[i][j] = grid[i][j-1] + grid[i-1][j];
            }
        }
        return grid[m-1][n-1];
    }
}