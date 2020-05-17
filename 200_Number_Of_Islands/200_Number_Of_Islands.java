class Solution {
    public int numIslands(char[][] grid) {
        
        // T.C. = O(M*N)
        // basd on the idea of merging recursively, each element is visited only once.
        if(grid.length == 0 || grid[0].length == 0 || grid == null)
            return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
       
        int count = 0;
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    merge(grid,i,j);
                }
            }
        }
        
        return count;
        
    }
    
    
    public void merge(char[][] grid, int i, int j) {
        
        int m = grid.length;
        int n = grid[0].length;
        
        if(i <0 || j < 0 || i >= m || j >= n || grid[i][j] != '1')
            return;
        
        grid[i][j] = 'X';
        
        merge(grid,i-1,j);
        merge(grid,i+1,j); 
        merge(grid,i,j-1);
        merge(grid,i,j+1);
   
    }
}
