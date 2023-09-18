class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        //split the words in the words array
        String words[] = s.split(" ");
        
        //comapre the length
        if(pattern.length() != words.length){
            return false;
        }
        
        //create hashmap to store the key value pair 
        HashMap<Character, String> map = new HashMap<Character, String>();
        
        //loop to trace
        for(int i=0; i<words.length; i++){
            //get the key from pattern 
            char ch = pattern.charAt(i);
            
           
            if(map.containsKey(ch)){ //check if map contains the key
                if(!map.get(ch).equals(words[i])){//check if stored value matches 
                    return false;
                }
            }else{
                
                if(!map.containsValue(words[i])){//if map does not contain value for that key
                    map.put(ch,words[i]);
                }else{
                    return false;
                }
            }
        }
        
        return true;
        
    
        
    }
}