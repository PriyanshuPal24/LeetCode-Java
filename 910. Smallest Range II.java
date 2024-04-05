class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        int min=nums[0];
        int score=max-min;   // reference score or base score
        for(int i=1;i<nums.length;i++){
            int Ma=Math.max(nums[i-1]+k,max-k);
            int Mi=Math.min(nums[i]-k,min+k);
            score=Math.min(score,(Ma-Mi));
        }
        return score;
    }
}
