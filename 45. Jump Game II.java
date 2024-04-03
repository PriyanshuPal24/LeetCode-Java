class Solution {
    public int jump(int[] nums) {
        int ri=0,rs=0,steps=0;
        if(nums.length==1)
        return 0;
        for(int i=0;i<nums.length;i++){
            ri=Math.max(ri,i+nums[i]);
            if(i==rs){
                steps++;
                rs=ri;
            }
            if(rs>=nums.length-1)
            return steps;
        }
        return steps;
    }
}
