// class Solution {
//     String str;
//     public int removeSubstring(String pair,int score){
//         int totalScore=0;
//         Stack<Character> st=new Stack<>();
//         char first=pair.charAt(0); 
//         char second=pair.charAt(1); 
//         for(char ch:str.toCharArray()){
//             if(ch==second && !st.isEmpty() && st.peek()== first){
//                 totalScore+=score;
//                 st.pop();
//             }else{
//                 st.push(ch);
//             }
//         }
//         StringBuilder sb=new StringBuilder();
//         while(!st.isEmpty()){
//             sb.insert(0,st.pop());
//         }
//         str=sb.toString();
//         return totalScore;
//     }
//     public int maximumGain(String s, int x, int y) {
//         str=s;
//         String firstPair=(x>y)?"ab":"ba";
//         String secPair=(firstPair.equals("ab"))?"ba":"ab";
        
//         int score=0;
//         score=removeSubstring(firstPair,Math.max(x,y));
//         score+=removeSubstring(secPair,Math.min(x,y));
//         return score;
//     }
// }
class Solution {
    char str[];
    public int removeSubstring(String pair,int score){
        int totalScore=0;
        Stack<Character> st=new Stack<>();
        char first=pair.charAt(0); 
        char second=pair.charAt(1); 
        for(char ch:str){
            if(ch==second && !st.isEmpty() && st.peek()== first){
                totalScore+=score;
                st.pop();
            }else{
                st.push(ch);
            }
        }
        int idx=st.size();
        str=new char[idx];
        for(int i=idx-1;i>=0;i--){
            str[i]=st.pop();
        }

        return totalScore;
    }
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        str=new char[n];
        for(int i=0;i<n;i++){
            str[i]=s.charAt(i);
        }

        String firstPair=(x>y)?"ab":"ba";
        String secPair=(firstPair.equals("ab"))?"ba":"ab";
        
        int score=0;
        score=removeSubstring(firstPair,Math.max(x,y));
        score+=removeSubstring(secPair,Math.min(x,y));
        return score;
    }
}
