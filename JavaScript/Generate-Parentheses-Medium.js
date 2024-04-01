// Problem Link: https://leetcode.com/problems/generate-parentheses/description/

// Performace:
//     RunTime:   62    ms  ( better then 21,35% of users of JavaScript )
//      Memory:   51.41 MB  ( better then 51,41% of users of JavaScript ) 


/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
  let stack = []
  let response = []

  function generate(openCount, closeCount) {  
    if(openCount === n && closeCount === n) {
      response.push(stack.join(""))
      return
    }

    if (openCount < n) {
      stack.push("(")
      generate(openCount+1, closeCount)
      stack.pop()
    }

    if (openCount > closeCount) {
      stack.push(")")
      generate(openCount, closeCount+1)
      stack.pop()
    }
  }

  generate(0, 0)
  return response
};