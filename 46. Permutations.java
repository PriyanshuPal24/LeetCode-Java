// class Solution {
//     public static void permutations(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] freq){
//         if(ds.size()==nums.length){
//             ans.add(new ArrayList<>(ds));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(freq[i]==false){
//                 freq[i]=true;
//                 ds.add(nums[i]);
//                 permutations(nums,ans,ds,freq);
//                 ds.remove(ds.size()-1);
//                 freq[i]=false;
//             }
//         }
//     }
//     public List<List<Integer>> permute(int[] nums) {
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> ds=new ArrayList<>();
//         boolean freq[]=new boolean[nums.length];
//         permutations(nums,ans,ds,freq);
//         return ans;
//     }
// }
class Solution {
    public static void permutations(int idx,int nums[],List<List<Integer>> ans){
        if(idx==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            permutations(idx+1,nums,ans);
            swap(i,idx,nums);
        }
    }
    public static void swap(int i,int j,int[] nums){
        int a=nums[i];
        nums[i]=nums[j];
        nums[j]=a;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permutations(0,nums,ans);
        return ans;
    }
}
