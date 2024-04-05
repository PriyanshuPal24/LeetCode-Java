class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<nums.length;i++){
            int a=nums[i-1]+nums[i];
            hm.put(a,hm.getOrDefault(a, 0) +1 );
        }
        for(Integer key:hm.keySet() ) {
             if(hm.get(key)>1){
                return true;
            }
        }
        return false;
    }
}
