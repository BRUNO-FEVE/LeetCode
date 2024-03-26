// Problem Link: https://leetcode.com/problems/valid-anagram/description/

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   33.00 ms  ( better then 05,10% of users of Java )
//      Memory:   44.22 MB  ( better then 55,59% of users of Java ) 

package Java;
import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    if(s.length() != t.length()) return false;

    HashMap<Character, Integer> charCountS = new HashMap<Character, Integer>();
    HashMap<Character, Integer> charCountT = new HashMap<Character, Integer>();

    for(int i=0; i<s.length(); i++) {
      if (charCountS.containsKey(s.charAt(i))) {
        charCountS.put(s.charAt(i), charCountS.get(s.charAt(i))+1);
      } else {
        charCountS.put(s.charAt(i), 1);
      }
      
      if (charCountT.containsKey(t.charAt(i))) {
        charCountT.put(t.charAt(i), charCountT.get(t.charAt(i))+1);
      } else {
        charCountT.put(t.charAt(i), 1);
      }
    }

    if (charCountS.equals(charCountT)) {
      return true;
    }
    return false;
  }
}