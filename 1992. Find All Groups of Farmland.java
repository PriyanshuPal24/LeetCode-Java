class Solution {
    public int[][] findFarmland(int[][] land) {
        int m=land.length;
        int n=land[0].length;
        ArrayList<int[]> al=new ArrayList<>();
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==1){
                    if((i==0||land[i-1][j]==0)&&(j==0 || land[i][j-1]==0)){
                        int right=j;
                        int down=i;
                        while(down+1<m &&land[down+1][j]==1) down++;
                        while(right+1<n &&land[i][right+1]==1) right++;
                        al.add(new int[]{i, j, down, right});
                    }
                }
            }
        }
        return al.toArray(new int[al.size()][]);
    }
}
