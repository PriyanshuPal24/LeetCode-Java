class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]<tickets[k]) count=count+tickets[i];
            else count+=tickets[k];
            if(i>k && tickets[i]>=tickets[k])count--; 
        }
        return count;
    }
}
