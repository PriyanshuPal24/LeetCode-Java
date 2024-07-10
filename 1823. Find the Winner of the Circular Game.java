class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> ans=new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(i);
        }
        int index=0;
        while(ans.size()>1){
           index=(index+(k-1))%ans.size();
           ans.remove(index);
        }
        return ans.get(0);
    }
}
