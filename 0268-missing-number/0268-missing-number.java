class Solution {
    public int missingNumber(int[] nums) {
        //missing number=actualSum-sum
        
        //sum
        int sum =0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        
        //actual sum
        int actualSum = nums.length*(nums.length+1)/2;
        
        int missingNumber = actualSum-sum;
        
        return missingNumber;
    }
}