class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean>ans=new ArrayList<>();
        for(int i=0;i<candies.length;i++) {
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<candies.length;i++){
            int sum=extraCandies;
            sum=sum+candies[i];
            if(sum>=max) ans.add(true);   
            else ans.add(false);
        }
        return ans;
    }
}
