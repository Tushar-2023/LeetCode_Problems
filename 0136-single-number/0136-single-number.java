class Solution {
    public int singleNumber(int[] nums) {
        //we can use XOR to calculate the non duplicate number in array
        //same number's xor will be zero and different xor will be one
        int value = 0;
        for(int i=0; i<nums.length; i++){
            value = value^nums[i];
        }
        
        
        return value;
    }
}