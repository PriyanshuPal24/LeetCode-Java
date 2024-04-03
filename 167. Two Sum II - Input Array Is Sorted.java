class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ret[]=new int[2];
        int lp=0;
		int rp=numbers.length-1;
		while(lp<rp) {
			if(numbers[lp]+numbers[rp]==target) {
				ret[0]=lp+1;
                ret[1]=rp+1;
			}
			if(numbers[lp]+numbers[rp]<target) {
				lp++;
			}else {
				rp--;
			}
		}
        return ret;
    }
}
