class Solution {
    public String reverseOnlyLetters(String s) {
        
        //swapping and isLetter() method of Character is used 
        
        //define two pointers
        int start = 0;
        int end = s.length()-1;
        
        //convert into char array to check isLetter()
        char ch[] = s.toCharArray();
        
        while(start<end){
            if(!Character.isLetter(ch[start])){
                start++;
            }
            
            else if(!Character.isLetter(ch[end])){
                end--;
            }
            
            else{
                
                //swap
                char temp = ch[start];
                ch[start]=ch[end];
                ch[end]=temp;
                
                start++;
                end--;
                
            }
        }
        
        return new String(ch);
        
    }
}