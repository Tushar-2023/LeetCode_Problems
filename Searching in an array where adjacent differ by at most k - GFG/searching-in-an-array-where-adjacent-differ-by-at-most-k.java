//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    int X = Integer.parseInt(br.readLine());
		    
		    Complete obj = new Complete();
		    int ans = obj.search(arr, sizeOfArray, X, K);
		    System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int search (int arr[], int n, int x, int k) {
        //Complete the function
        
        //brutforce approcach
        // for(int i=0; i<n; i++){
        //     if(arr[i] == x){
        //         return i;
        //     }
        // }
        // return -1;
        
        
        //optimized approach
        int index=0;
        
        while(index<n){
            //check
            if(arr[index]==x){
                return index;
            }
            
            //calculate steps
            //math.abs is to get the only positive value
            int steps = Math.abs(arr[index]-x)/k;
            
            //update the index
            index = index+Math.max(1,steps);
        }
        
        return  -1;
        
    }
    
    
}





