class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1 );
        }
        int res=0;
        int oddcount=0;
        for(Character ch:hm.keySet()){
            if(hm.get(ch)%2==0){
                res+=hm.get(ch);
            }else{
                if(hm.get(ch)-1>0){
                    res+=hm.get(ch)-1;
                }
                oddcount=1;
            }
        }
        if(oddcount==1) return res+1;
        return res;
    }
}
