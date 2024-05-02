class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer > set=new HashSet<>();
        int ans=-1;
        for(int num:nums) {
            if(set.contains(-num)){
                ans=Math.max(ans,Math.abs(num));
            }else{
                set.add(num);
            }
		}
        return ans;
    }
}
