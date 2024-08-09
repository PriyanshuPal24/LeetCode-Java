class Solution {
    public int findrowSum(int[][]grid,int r,int c){
        boolean visited[]=new boolean[10];
        int sum=0;
        for(int i=0;i<3;i++){
            int rowSum=0;
            for(int j=0;j<3;j++){
                int value=grid[r+i][c+j];
                if(value==0|| value>=10 ||visited[value]){
                    return -1;
                }
                visited[value]=true;
                rowSum+=value;
            }
            if(i==0){
                sum=rowSum;
            }else{
                if(sum!=rowSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public int findcolSum(int[][]grid,int r,int c){
        int sum=0;
        for(int j=0;j<3;j++){
            int colSum=0;
            for(int i=0;i<3;i++){
                int value=grid[r+i][c+j];
                colSum+=value;
            }
            if(j==0){
                sum=colSum;
            }else{
                if(sum!=colSum){
                    return -1;
                }
            }
        }
        return sum;
    }
    public int finddiagonalSum(int[][]grid,int r,int c){
        int d1=grid[r][c]+grid[r+1][c+1]+grid[r+2][c+2];
        int d2=grid[r][c+2]+grid[r+1][c+1]+grid[r+2][c];
        if(d1==d2){
            return d1;
        }
        return -1;
    }
    public boolean ismagicSquare(int[][]grid,int r,int c){
        int rowSum=findrowSum(grid,r,c);
        if(rowSum==-1) return false;
        int colSum=findcolSum(grid,r,c);
        if(colSum==-1) return false;
        int diaSum=finddiagonalSum(grid,r,c);
        if(diaSum==-1) return false;
        if(rowSum==colSum && rowSum==diaSum) return true;
        return false;
    }
    public int numMagicSquaresInside(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                if(ismagicSquare(grid,i,j)){
                    count++;
                }     
            }
        }
        return count;
    }
}
