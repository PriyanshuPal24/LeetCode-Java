class Solution {
    public int fun(int[][] grid, int i, int j) {
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]==0) {
            return 1;
        }
        if(grid[i][j] == -1) return 0;
        grid[i][j] = -1;

        int perimeter = 0;
        perimeter += fun(grid, i+1, j);
        perimeter += fun(grid, i-1, j);
        perimeter += fun(grid, i, j+1);
        perimeter += fun(grid, i, j-1);
        return perimeter;
    }
    public int islandPerimeter(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    count=fun(grid,i,j);
                    break;
                }
            }
        }
        return count;
    }
}
