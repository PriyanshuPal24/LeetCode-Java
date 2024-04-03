class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        for(int i=0,j=n-1;i<j;){
            int amt= (height[i]<height[j]?height[i]:height[j])*(j-i);
               max=max<amt?amt:max;
               int temp=height[i]<height[j]?i++:j--;
         }
         return max;
    }
}
