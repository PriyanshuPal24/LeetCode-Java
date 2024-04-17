class Solution {
    public String gcdOfStrings(String str1, String str2) {
         if (str1.length() < str2.length()) return gcdOfStrings(str2,str1);
         if (str1.startsWith(str2)) {
            String remainder = str1.substring(str2.length());
            if (remainder.isEmpty()) {
                return str2;
            } else {
                return gcdOfStrings(str2, remainder);
            }
        } else {
            return "";
        }
    }
}
