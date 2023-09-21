class Solution {
    public int majorityElement(int[] nums) {
        
        //Moore voting Algorithm used
        //winner element is the majority one
        
        int candidate=0;
        int points=0;
        
        //playing the game
        for(int i=0; i<nums.length; i++){
            if(points==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]){
                points++;
            }else{
                points--;
            }
        }
        
        return candidate;
        
    }
}