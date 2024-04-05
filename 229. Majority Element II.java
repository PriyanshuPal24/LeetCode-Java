class Solution {
    public List<Integer> majorityElement(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			hm.put(arr[i],hm.getOrDefault(arr[i], 0) +1 );
		}
		LinkedList<Integer>li=new LinkedList<>();
		for(Integer key:hm.keySet() ) {
			if(hm.get(key)>arr.length/3) {
				li.add(key);
			}
		}
        return li;
    }
}
