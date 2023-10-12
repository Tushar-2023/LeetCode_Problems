class Solution {
    public void rotate(int[] nums, int k) {
        
        //3 steps process
        //reverse whole array
        //reverse first k elements
        //reverse k to n-1 elements
        
        int n=nums.length;
        k=k%n;
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);    
    }
    
    public static void reverse(int arr[], int start, int end){
        
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
    
    
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}