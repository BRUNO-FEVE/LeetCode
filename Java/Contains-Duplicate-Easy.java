// Problem Link: https://leetcode.com/problems/contains-duplicate/description/

// First Solution 

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   11 ms      ( better then 75,22% of users of Java )
//      Memory:   58.89 MB   ( better then 56,89% of users of Java ) 

package Java;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean containsDuplicate(int[] nums) {
      Set<Integer> hasBeen = new HashSet<Integer>() ;

      for(int i=0; i<nums.length; i++) {
        if (hasBeen.contains(nums[i])) {
          return true;
        } else {
          hasBeen.add(nums[i]);
        }
      }

      return false;
  }
}