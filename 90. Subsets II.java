class Solution {
    public static void subsetsum(int idx,int sum,int n,int arr[],List<List<Integer>> ans,List<Integer>ds) {
		ans.add(new ArrayList<>(ds));
		for(int i=idx;i<n;i++) {
			if(i>idx && arr[i]==arr[i-1]) continue;
			ds.add(arr[i]);
			subsetsum(i+1,sum+arr[i],n,arr,ans,ds);
			ds.remove(ds.size()-1);
		}
	}
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
		subsetsum(0,0,n,nums,ans,new ArrayList<>());
        return ans;
    }
}
