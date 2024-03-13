// Problem Link: https://leetcode.com/problems/longest-common-prefix/description/

// First Solution 

// Space Complexity: O(n)
//  Time Complexity: O(nˆ2)

// Performace:
//     RunTime:   9 ms      ( better then 7,24% of users of Java )
//      Memory:   41.68 MB  ( better then 37,56% of users of Java ) 

package Java;
import java.util.Arrays;

class Solution {
  public String longestCommonPrefix(String[] strs) {

    String response = "";
    
    for (int i = 0; i < strs[0].length(); i++) {
      for (int j = 0; j < strs.length; j++) {
        if (j < strs[j].length()) {
            if (strs[0].charAt(i) == strs[j].charAt(i) && j == strs.length-1 ) {
              response += strs[i].charAt(i);
            } else if (strs[0].charAt(i) != strs[j].charAt(i)) {
              return response;
            }          
        }

      }
    }

    return response;
  }
}

// Improved Solution: Improving using just ONE for and StringBuilder and ArraySort.
// before going to the loop.

// Space Complexity: O(n)
//  Time Complexity: O(n*log(m))

// Performace:
//     RunTime:   1 ms      ( better then 77,94% of users of Java )
//      Memory:   41.33 MB  ( better then 66,47% of users of Java ) 

class ImprovedSolution {
  public String longestCommonPrefix(String[] strs) {

    StringBuilder response = new StringBuilder();

    Arrays.sort(strs);
    
    for (int i = 0; i < strs[0].length(); i++) {
      if (strs[0].charAt(i) != strs[strs.length-1].charAt(i)) {
        return response.toString();
      }
      response.append(strs[0].charAt(i));
    }

    return response.toString();
  }
}