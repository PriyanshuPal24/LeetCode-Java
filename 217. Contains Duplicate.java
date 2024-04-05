class Solution {
    public boolean containsDuplicate(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i], 0) +1 );
		}
		
		for(Integer key:hm.keySet() ) {
			if(hm.get(key)>1) {
				return true;
			}
		}
        return false;
    }
}
