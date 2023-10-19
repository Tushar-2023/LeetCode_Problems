class Solution {
    public int[] plusOne(int[] digits) {
        
        for(int i=digits.length-1; i>=0; i--){
            //if less than 9
            if(digits[i]< 9){
                digits[i]++;
                return digits;
            }
            
            //if last digit is 9
            digits[i]=0;
        }
        
        //if only number is exist in arrray and it is 9 then array length should be exceeded by one 
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
        
    }
}