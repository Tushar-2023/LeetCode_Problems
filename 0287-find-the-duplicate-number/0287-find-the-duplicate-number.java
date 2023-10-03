class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i=0; i<nums.length; i++){
            
            int index = Math.abs(nums[i]);
            
            //check
            if(nums[index]<0){
                return index;
            }
            
            nums[index] = -nums[index];
        }
        
        return -1;
    }
}