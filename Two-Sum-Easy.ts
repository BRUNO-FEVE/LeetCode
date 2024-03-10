// Problem Link: https://leetcode.com/problems/two-sum/

// Time and Space Complexity: O(nˆ2) 

// Performace:
//     RunTime:   130 ms      ( better then 18,49% of users of TypeScript )
//      Memory:   51.76 MB  ( better then 79,20% of users of TypeScript ) 

function twoSum(nums: number[], target: number): number[] {
  for(let i=0; i<nums.length; i++) {
      let amostTarget = target - nums[i];

      nums[i] = undefined

      if(nums.includes(amostTarget)) {
          return [ i, nums.indexOf(amostTarget) ]
      }
  }
};
