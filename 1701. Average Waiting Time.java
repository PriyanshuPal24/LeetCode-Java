class Solution {
    public double averageWaitingTime(int[][] customers) {
        int idletime=1;
        long totalWt=0;
        for(int []customer: customers){
            if(idletime<=customer[0]){
                idletime=customer[0];
            }
            idletime=idletime+customer[1];
            totalWt+=(idletime-customer[0]);
        }
        double avg=(totalWt /(double)customers.length);
        return avg;
    }
}
