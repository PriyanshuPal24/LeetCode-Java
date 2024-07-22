class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++){
            map.put(heights[i],names[i]);
        }
        String res[]=new String[heights.length];
        int i=0;
        for(Integer key:map.keySet()){
            res[i]=map.get(key);
            i++;
        }
        return res;
    }
}
