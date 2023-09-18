class Solution {
    public String reverseVowels(String s) {
        
        //two pointers
        int start=0;
        int end=s.length()-1;
        
        //array to store the characters of the string
        char ch[] = s.toCharArray();
        
        //loop to check 
        while(start<end){
            if(!isVowel(ch[start])){
                start++;
            }else if(!isVowel(ch[end])){
                end--;
            }else{
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                
                start++;
                end--;
            }
        }
        
        return String.valueOf(ch);
        
    }
    
    
    //loop to check the whether the character is vowel or not
    public static boolean isVowel(char ch){
       if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
             return true;
       }
        return false;
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}