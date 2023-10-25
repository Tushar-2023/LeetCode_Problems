class Solution {
    public int climbStairs(int n) {
        
        
        //fibboncci sequence
        //n=3 prynt same no of distinct ways of climbing the stairs 
        if(n<=3){
            return n;
        }
        int a=3,b=2;
        
        //for steps more than 3 it is summation of previous two distinct ways step
        for(int i=0; i<n-3; i++){
            a=a+b;
            b=a-b;
        }
        
        return a;
    }
}