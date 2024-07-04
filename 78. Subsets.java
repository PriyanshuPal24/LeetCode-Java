class Solution {
    public static void subsequence(int arr[],List<Integer> al,List<List<Integer>> res,int idx) {
		if(idx==arr.length){
			res.add(new ArrayList<>(al));
			return;
		}
		al.add(arr[idx]);
		subsequence(arr,al,res,idx+1);
		al.remove(al.size()-1);
		subsequence(arr,al,res,idx+1);
	}
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        subsequence(nums,al,res,0);
       return res;
    }
}
