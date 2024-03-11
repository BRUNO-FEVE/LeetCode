package java;
class Solution {
  public boolean isPalindrome(int x) {

    int count = 0;
    String number = String.valueOf(x);

    if (x < 0) {
      return false;
    } 

    while (count != number.length()/2) {
      
      if (number.charAt(count) != number.charAt((number.length() - 1) - count)) {
        return false;
      }

      count++;
    }
    
    return true;
  }
}