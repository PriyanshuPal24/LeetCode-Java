class Solution {
    public int findMiddleIndex(int[] nums) {
        int left=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int right=total-nums[i]-left;
            if(left==right) return i;
            left+=nums[i];
        }
        return -1;
    }
}
