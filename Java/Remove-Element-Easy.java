// Problem Link: https://leetcode.com/problems/remove-element/description/

// First Solution 

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   0 ms      ( better then 100% of users of Java ) Lowest Runtime
//      Memory:   41.64 MB  ( better then 77,94% of users of Java ) 

package Java;

import java.util.ArrayList;

class Solution {
  public int removeElement(int[] nums, int val) {
      ArrayList<Integer> notEqualToVal = new ArrayList<Integer>();

      for(int i=0; i<nums.length; i++) {
        if (val != nums[i]) {
          nums[notEqualToVal.size()] = nums[i];
          notEqualToVal.add(nums[i]);
        }
      }

      return notEqualToVal.size();
  }
}