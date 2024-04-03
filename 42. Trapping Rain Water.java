class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int Lb[]=new int[n];
		Lb[0]=height[0];
		for(int i=1;i<n;i++) {
			Lb[i]=Math.max(height[i], Lb[i-1]);
		}
		//FIND THE MAXIMUM RIGHT BOUNDARY ARRAY
		int Rb[]=new int[n];
		Rb[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			Rb[i]=Math.max(height[i],Rb[i+1]);
		}
		//CALCULATE THE TRAPPING WATER
		//water level
		//Trapped Water=(Water Level-Heght)*width, width=1
		int trappedwater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(Lb[i], Rb[i]);
			trappedwater=trappedwater+(waterlevel-height[i]);
		}
		return trappedwater;
    }
}
