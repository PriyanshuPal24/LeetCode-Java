class Solution {
    public int maxProfit(int[] prices) {
        Scanner sc=new Scanner(System.in);
        int maxprofit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(buy>prices[i]){
                buy=prices[i];
            }
             if(prices[i]-buy>maxprofit){
                maxprofit=prices[i]-buy;
            }
        }
        return maxprofit;
    }
}
