class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count =0;
        
        for(int i=0; i<n; i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        
       //nums[count++] = nums[nums.length-1];
        
        return count;
        
        
    }
}