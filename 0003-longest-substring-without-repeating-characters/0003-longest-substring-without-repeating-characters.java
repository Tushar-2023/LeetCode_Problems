class Solution {
    public int lengthOfLongestSubstring(String s) {
     
     //two pointer approach
     int left=0, right=0;

     //Hashset to store the unique elements
     Set<Character> set = new HashSet();

     //max variable to store the maximum size of the window
     int max = 0;

     while(right<s.length()){
         char c = s.charAt(right);

         if(set.add(c)){
             max = Math.max(max, right-left+1);
             right++;

         }else{

             while(s.charAt(left) != c){
                 set.remove(s.charAt(left));
                 left++;
             } 
             
              set.remove(c);
              left++;
         }
     }

     return max;
        
    }
}