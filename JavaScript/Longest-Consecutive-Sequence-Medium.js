// Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n * log n)

// Performace:
//     RunTime:   134   ms  ( better then 48,27% of users of JavaScript )
//      Memory:   71.39 MB  ( better then 82,91% of users of JavaScript ) 

/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
  if (nums.length === 0) return 0
  nums.sort((a, b) => a - b)

  let count = new Map()
  for(let i=0; i<nums.length; i++) {
    count.set(nums[i]+1, (count.get(nums[i]) || 0) + 1)
  }

  console.log(count)

  let bigger = 0
  count.forEach((element) => {
    if (bigger < element) {
      bigger = element
    }
  })


  return bigger
};

// With Time Complexity of O(n)

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   1368  ms  ( better then  5,03% of users of JavaScript )
//      Memory:   71.39 MB  ( better then 69,44% of users of JavaScript ) 


/**
 * @param {number[]} nums
 * @return {number}
 */
var longestConsecutive = function(nums) {
  let numberSet = new Set(nums)

  let biggerLength = 0
  for(let i=0; i<nums.length; i++) {
    if (!numberSet.has(nums[i]-1)) {
      let count = 0
      while(numberSet.has(nums[i]+count)) {
        count++
      }
      if (biggerLength < count) {
        biggerLength = count
      }
    }
  }

  return biggerLength
};