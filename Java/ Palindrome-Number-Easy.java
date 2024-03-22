// Problem Link: https://leetcode.com/problems/palindrome-number/description/

// Time and Space Complexity: O(n)

// Performace:
//     RunTime:   6 ms      ( better then 37,33% of users of Java ) 
//      Memory:   43.33 MB  ( better then 98,42% of users of Java ) 

package Java;

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