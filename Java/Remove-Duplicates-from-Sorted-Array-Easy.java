// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

// First Solution 

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   18 ms      ( better then 5,32% of users of Java )
//      Memory:   44.41 MB  ( better then 85,40% of users of Java ) 

package Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

class Solution {
  public int removeDuplicates(int[] nums) {
    ArrayList<Integer> uniqueValues = new ArrayList<Integer>();

    for(int i=0; i<nums.length; i++) {
      if (!uniqueValues.contains(nums[i])) {
        nums[uniqueValues.size()] = nums[i];
        uniqueValues.add(nums[i]);
      }
    }

    return uniqueValues.size();
  }
}

// Improved Solution: Changing to a Set.

// Space Complexity: O(n)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   2 ms      ( better then 13,49% of users of Java )
//      Memory:   44.35 MB  ( better then 44,71% of users of Java ) 

class ImprovedSolution {
  public int removeDuplicates(int[] nums) {
      Set<Integer> uniqueValues = new HashSet<Integer>();

      for(int i=0; i<nums.length; i++) {
          if (!uniqueValues.contains(nums[i])) {
              nums[uniqueValues.size()] = nums[i];
              uniqueValues.add(nums[i]);
          }
      }

      return uniqueValues.size();
  }
}