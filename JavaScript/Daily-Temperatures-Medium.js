// Problem Link: https://leetcode.com/problems/daily-temperatures/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   226   ms  ( better then 42,05% of users of JavaScript )
//      Memory:   70.94 MB  ( better then 91,31% of users of JavaScript ) 


/**
 * @param {number[]} temperatures
 * @return {number[]}
 */
var dailyTemperatures = function(temperatures) {
  let response = new Array(temperatures.length).fill(0)
  let stack = []

  for(let i=temperatures.length-1; i>=0; i--) {
    
    while(stack.length > 0 && temperatures[i] >= temperatures[stack[stack.length-1]]) [
      stack.pop()
    ]

    if (stack.length > 0) {
      response[i] = stack[stack.length-1] - i
    }
    
    stack.push(i)
  }

  return response
};

dailyTemperatures([1, 3, 4, 3, 5])