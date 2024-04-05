class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<Integer>();
        HashSet<Integer> a=new HashSet<Integer>();
        for(int i=0;i<nums1.length;i++)
        h1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++){
            if(h1.contains(nums2[i]))
            a.add(nums2[i]);
        }
        int res[]=new int [a.size()];
        int index=0;
        for(int i:a){
            res[index++]=i;
        }
        return res;
    }
}
