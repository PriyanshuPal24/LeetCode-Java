class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str = string(s);
        int k=0,j=str.length()-1;
        int mid=(str.length()+1)/2;
        for(int i=0;i<mid;i++){
            if(str.charAt(k)!=str.charAt(j)){
                return false;
            }else{
                k++;j--;
            }
        }
        return true;
    }
    public String string(String s){
        int n=s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(  Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) ){
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString();
        return s;
    }
}
