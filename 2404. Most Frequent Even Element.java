class Solution {
    public int mostFrequentEven(int[] arr) {
        TreeMap<Integer,Integer> hm=new TreeMap<>();
		
		for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0){
	            hm.put(arr[i],hm.getOrDefault(arr[i], 0) +1 );
            }
        }

        Integer maxi=0;
        for(Integer key:hm.keySet() ) {
            maxi=Math.max(maxi,hm.get(key));
        }
        for(Integer key:hm.keySet() ){
            if(hm.get(key)==maxi){
                return key;
            }
        }
        return -1;
    }
}
