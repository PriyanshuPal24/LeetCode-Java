class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int n=needle.length();
            if( haystack.charAt(i) == needle.charAt(0)){
                String str = haystack.substring( i, n+i );
                if(str.equals( needle )){
                    return i;
                }
            }
        }
        return -1;
    }
}
