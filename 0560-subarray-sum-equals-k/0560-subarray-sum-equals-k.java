class Solution {
    public int subarraySum(int[] nums, int k) {
    //approach-prefix sum and frequency map
    //k=3
    
    //variable to store the subarrays couunt and sum of subarray
    int res=0;
    int sum=0;
   
    //map to store the frequency of sum
    HashMap<Integer,Integer> map = new HashMap<>();
    
        
    for(int i=0; i<nums.length; i++){
        
        //calculting the sum at each point
        sum=sum+nums[i];
        
        //checking the condition
        if(sum==k){
            res++;
        }
        
        //sum-k che sum ahe tr k che pn ahech
        if(map.containsKey(sum-k)){
            res+=map.get(sum-k);
        }
        
        
        //updating the frequency map
        if(!map.containsKey(sum)){
            map.put(sum,1);
        } else{
            map.put(sum,map.get(sum)+1);
        }
       
    }
    
        return res;
    }
}