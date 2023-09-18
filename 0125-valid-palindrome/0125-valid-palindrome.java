class Solution {
    public boolean isPalindrome(String s) {
      //3 stpeps process is to check for the pallindrome

      //first -convert the string into the lowercase 
      s = s.toLowerCase();

      //second -remove the non alphanumeric characters
      //use stringbuilder to store the alphanumeric characters
      StringBuilder b = new StringBuilder();
      //use loop to track the alhanumeric characters
      for(int i=0; i<s.length(); i++){
        if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
          b.append(s.charAt(i));
        }
      }


      //third -chack fot pallindrome
      //length of the sb is
      int n = b.length()-1;
      for(int i=0; i<b.length()/2; i++){
        if(b.charAt(i) != b.charAt(n-i)){
          return false;
        }
        
      }
      return true;

      
      
    }
}