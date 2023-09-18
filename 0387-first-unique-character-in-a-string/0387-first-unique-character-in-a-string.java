class Solution {
    public int firstUniqChar(String s) {
        //array to maintain the charcter count
        int charCount[] = new int[26];
        
        //convert the string into the char array
        char chars[] = s.toCharArray();
        
        //fill the count array
        for(char c: chars){
            charCount[c-'a']++;
                      
        }
        
        
        //to check the first unique char
        for(int i=0; i<chars.length; i++){
           if(charCount[chars[i]-'a'] == 1){
               return i;
           }
               
           
                        
                        
        }
        
        return -1;
    }
}