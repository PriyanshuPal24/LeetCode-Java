class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int count=0;
        for(int mid=1;mid<n-1;mid++){
            int leftScount=0;
            for(int i=0;i<mid;i++){
                if(rating[i]<rating[mid]){
                    leftScount++;
                }
            }
            int rightLcount=0;
            for(int i=mid+1;i<n;i++){
                if(rating[i]>rating[mid]){
                    rightLcount++;
                }
            }
            count+=(leftScount*rightLcount);
            int leftLcount=mid-leftScount;
            int rightScount=n- mid-1 -rightLcount;
            count+=(leftLcount*rightScount);
        }
        return count;
    }
}
