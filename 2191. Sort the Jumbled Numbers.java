class Solution {
    public int toNum(int num, int[] mapping) {
        if (num == 0) {
            return mapping[0];
        }
        int res = 0;
        int curMult = 1;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            res += mapping[digit] * curMult;
            curMult *= 10;
        }
        return res;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                ans.add(new int[]{mapping[nums[i]],i});
            }else{
                ans.add(new int[]{toNum(nums[i],mapping),i});
            }
        }
        Collections.sort(ans,(x,y)->x[0]-y[0]);
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[ans.get(i)[1]];
        }
        return res;
    }
}
