class Solution {
    public static int firstoccurance(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        int mid=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target && (mid==0 || arr[mid-1]!=target)){
                return mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static int lastoccurance(int arr[],int target,int n){
        int low=0;
        int high=n-1;
        int mid=-1;
        while(low<=high){
            mid=low+(high-low)/2;
            if(arr[mid]==target && (mid==n-1 || arr[mid+1]!=target)){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int ans[]=new int[2];
        ans[0]=firstoccurance(nums,target,n);
        ans[1]=lastoccurance(nums,target,n);
        return ans;
    }
}
