class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> s=new Stack<>();
        if(k>=num.length()) return "0";
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while (!s.isEmpty() && s.peek() > ch && k > 0) {
                s.pop();
                k--;
            }
            s.push(ch);
        }

        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();

    }
}
