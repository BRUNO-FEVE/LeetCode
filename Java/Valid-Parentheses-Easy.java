// Problem Link: https://leetcode.com/problems/valid-parentheses/description/

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   2 ms      ( better then 54,18% of users of Java )
//      Memory:   41.59 MB  ( better then 32,21% of users of Java ) 

package Java;
import java.util.ArrayList;

class Solution {
  public boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;

    ArrayList<Character> openLeft = new ArrayList<Character>();

    String open = "([{";

    for (int i = 0; i < s.length(); i++) {
      if (open.contains(String.valueOf(s.charAt(i)))) {
        openLeft.add(s.charAt(i));
      } else {
        if(openLeft.size() == 0) return false;
        if (openLeft.get(openLeft.size()-1) == returnThePair(s.charAt(i))) {
          openLeft.remove(openLeft.size()-1);
        } else {
            return false;
        }
      }
    }

    if (openLeft.isEmpty()) return true;
    return false;
  }

  public Character returnThePair(Character c) {
    switch (c) {
      case ')':
        return '(';
      case ']':
        return '[';
      default:
        return '{';
    }
  }
}