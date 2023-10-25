class Solution {
    public int addDigits(int num) {
        
        //if num==0 then sum=0
        //if num%9==0 then sum is 9
        //for remaining sum is remainder of (num%9)
        
        if(num==0){
            return num;
        }
        
        return (num%9==0)?9:(num%9);
        
    }
}