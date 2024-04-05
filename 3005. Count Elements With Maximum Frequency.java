class Solution {
    public int maxFrequencyElements(int[] nums) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
		
		for(int i=0;i<nums.length;i++) {
	        hm.put(nums[i],hm.getOrDefault(nums[i], 0) +1 );
        }
        Integer maxi=0;
        for(Integer key:hm.keySet() ) {
            maxi=Math.max(maxi,hm.get(key));
        }
        int sum=0;
        for(Integer key:hm.keySet() ){
            if(hm.get(key)==maxi){
                sum+=maxi;
            }
        }
        return sum;
    }
}
