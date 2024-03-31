// Problem Link: https://leetcode.com/problems/top-k-frequent-elements/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   99    ms  ( better then 24,39% of users of JavaScript )
//      Memory:   64.54 MB  ( better then 64,54% of users of JavaScript ) 

/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {  
  let response = new Array(nums.length).fill(1)

  let pre = 1, post = 1
  for (let i=0; i<nums.length; i++) {
    response[i] *= pre
    pre *= nums[i]

    response[nums.length-1 - i] *= post
    post *= nums[nums.length-1 - i]
  }
  return response
};