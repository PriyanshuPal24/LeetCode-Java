class Solution {
    public int largestRectangleArea(int[] arr) {
        int maxArea=0;
		int nsl[]=new int[arr.length];
		int nsr[]=new int[arr.length];
		
		//RIGHT
		Stack<Integer> s=new Stack<>();
		for(int i=arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsr[i]=arr.length;
			}else {
				nsr[i]=s.peek();
			}
			s.push(i);
		}
		
		//LEFT
		s=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				nsl[i]=-1;
			}else {
				nsl[i]=s.peek();
			}
			s.push(i);
		}
		
		//CURRENT AREA
		for(int i=0;i<arr.length;i++) {
		    int heigth=arr[i];
		    int width=nsr[i]-nsl[i]-1;
		    int currArea=heigth*width;
		    maxArea=Math.max(maxArea, currArea);
		}
        return maxArea;
    }
}
