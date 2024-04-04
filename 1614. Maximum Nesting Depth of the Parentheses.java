class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        int cop=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                count++;
            }
            cop=Math.max(cop,count);
            if(ch==')'){
                count--;
            }
        } 
        return cop;
    }
}
