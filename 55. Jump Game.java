class Solution {
    public boolean canJump(int[] nums) {
        int ri=0;
        for(int i=0;i<nums.length;i++){
            if(i<=ri){
                if(ri<(i+nums[i]))
                 ri=i+nums[i];
            }else 
            return false;
        }
        return true;
    }
}
