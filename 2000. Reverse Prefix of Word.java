class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder(word);
        int i=0;
        int j=0;
        while (j < sb.length() && sb.charAt(j) != ch) {
            j++;
        }
        if (j == sb.length()) {
            return word;
        }
        while(i<j){
            char temp=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;j--;
        }
        return sb.toString();
    }
}
