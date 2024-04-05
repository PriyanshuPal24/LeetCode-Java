class Solution {
    boolean b[];
    public boolean canReach(int[] arr, int start) {
        b = new boolean[arr.length];
        return check(arr,start);
    }
    boolean check(int arr[],int i){
        if(i<0||i>=arr.length||b[i]){
            return false;
        }
        if(arr[i]==0) return true;
        b[i]=true;
        return check(arr,i+arr[i])||check(arr,i-arr[i]); 
    }
}
