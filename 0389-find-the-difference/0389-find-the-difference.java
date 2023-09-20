class Solution {
    public char findTheDifference(String s, String t) {
        
        //we can solve this problem using ascii values subtraction
        
        //variable to maintain the sum of the ascii value of charcters in string t
        int total=0;
        
        //loop to calculate the ascii values in string t
        for(int i=0; i<t.length(); i++){
            total = total+t.charAt(i);
        }
        
        //loop to calculate the ascii values in string s
        for(int i=0; i<s.length(); i++){
            total = total-s.charAt(i);
        }
        
        //return the character of the remaining ascii value
        return (char)total;
        
    }
}