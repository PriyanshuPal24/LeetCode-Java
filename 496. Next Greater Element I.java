class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack <Integer> s =new Stack<>();  // TO STORE THE INDEX OF ELEMENT
		int n=nums2.length;
		int nxtGreater[]=new int[n];
		
		for(int i=n-1;i>=0;i--) {
			while(!s.isEmpty() && nums2[s.peek()]<=nums2[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nxtGreater[i]=-1;
			}else {
				nxtGreater[i]=nums2[s.peek()];
			}
			s.push(i);
		}
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i],nxtGreater[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }
        }
        return nums1;
    }
}
