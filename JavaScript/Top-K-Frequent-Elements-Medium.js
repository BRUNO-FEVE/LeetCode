// Problem Link: https://leetcode.com/problems/top-k-frequent-elements/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n + k*n)

// Performace:
//     RunTime:   96    ms  ( better then 9,43% of users of JavaScript )
//      Memory:   51.80 MB  ( better then 93,79% of users of JavaScript ) 

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number[]}
 */
var topKFrequent = function(nums, k) {
    let numbersCount = new Map()

    for(let i=0; i<nums.length; i++) {
      if (numbersCount.has(nums[i])) {
        numbersCount.set(nums[i], numbersCount.get(nums[i])+1)
      } else {
        numbersCount.set(nums[i], 1)
      }
    }

    let response = []
    for(let i=0; i<k; i++) {
      let bigger = undefined
      numbersCount.forEach((value, key) => {
        if (bigger == undefined || numbersCount.get(bigger) < value) {
          bigger = key
        }
      })
      response.push(bigger)
      numbersCount.delete(bigger)
    }
    return response
};