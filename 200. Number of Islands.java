class Solution {
    public void fun(char[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]!='1') {
            return ;
        }
        grid[i][j] = '2';
        fun(grid, i+1, j);
        fun(grid, i-1, j);
        fun(grid, i, j+1);
        fun(grid, i, j-1);
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                    fun(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}
