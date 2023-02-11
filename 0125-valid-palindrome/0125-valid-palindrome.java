class Solution {
    public boolean isPalindrome(String s) {
      String s2="";
      for(int i=0;i<s.length();i++){
          if(Character.isLetterOrDigit(s.charAt(i))==false){ continue; }
          s2+=s.charAt(i);
      }
      int i=0,j=s2.length()-1;
      s2=s2.toUpperCase();
      while(i<j){
          if(s2.charAt(i)!=s2.charAt(j)) return false;
            i++;
            j--;
      }
      return true;
    }
}