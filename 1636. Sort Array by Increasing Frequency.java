class Solution {
    public int[] frequencySort(int[] nums) {
        TreeMap<Integer,Integer> map = new TreeMap<>();//<Key(element of array),Value(Frequency)>
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int n=nums.length;
        Integer temp[]=new Integer[map.size()];
        int i=0;
        for(Integer key: map.keySet()){
            temp[i]=key;
            i++;
        }
        Arrays.sort(temp,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                if(map.get(a)==map.get(b)){
                    return b-a;
                }
                return map.get(a)-map.get(b);
            }
        });
        i=0;
        for(Integer key:temp){
            int f=map.get(key);
            for(int j=0;j<f;j++){
                nums[i]=key;
                i++;
            }
        }
        return nums;
    }
}
