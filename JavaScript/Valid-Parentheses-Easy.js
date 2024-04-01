// Problem Link: https://leetcode.com/problems/valid-parentheses/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   56    ms  ( better then 65,01% of users of JavaScript )
//      Memory:   50.08 MB  ( better then 61,64% of users of JavaScript ) 

/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) { 
  let open = "([{"
  let close = ")]}"

  let openStack = []
  for(let i=0; i<s.length; i++) {
    if (open.includes(s.charAt(i))) {
      openStack.push(s.charAt(i))
    } else {
      if (openStack[openStack.length-1] === open[close.indexOf(s.charAt(i))]) {
        openStack.pop()
      } else {
        return false
      }
    }
  }
  if (openStack.length === 0) return true

  return false
};