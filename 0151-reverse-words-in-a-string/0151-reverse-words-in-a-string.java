class Solution {
    public String reverseWords(String s) {
        
    //split the words on the basis of spaces
    //store them into the array
    String str[] = s.split(" +");
    
    //create the string builder to make a reverse string
    StringBuilder sb = new StringBuilder();

    //loop to trace the array
    for(int i=str.length-1; i>=0; i--){
        sb.append(str[i]);
        sb.append(" ");
    }

    return sb.toString().trim();

    
    }
}