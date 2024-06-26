class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int open=0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (open > 0) {
                    sb.append(c);
                }
                open++;
            } 
            if (c == ')') {
                if (open > 1) {
                    sb.append(c);
                }
                open--;
            }
        }
        return sb.toString();
   }
}
