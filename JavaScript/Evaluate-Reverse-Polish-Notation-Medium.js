// Problem Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   123   ms  ( better then 16,65% of users of JavaScript )
//      Memory:   58.39 MB  ( better then 14,80% of users of JavaScript ) 


/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function(tokens) {  
  let numberStack = []

  for(let i=0; i<tokens.length; i++) {
    if(!"+-*/".includes(tokens[i])) {
      numberStack.push(parseInt(tokens[i]))
    } else {
      let result = calculate(tokens[i], numberStack[numberStack.length-2], numberStack[numberStack.length-1])
      console.log(result)
      numberStack.pop()
      numberStack.pop()
      numberStack.push(result)
    }
  }

  return numberStack[0]
};

function calculate (operation, num1, num2 ) {
  switch(operation) {
    case "+": 
      return num1 + num2;
    case "-": 
      return num1 - num2;
    case "*": 
      return num1 * num2;
    case "/": 
      if (num1 / num2 < 0) return Math.ceil(num1 / num2)
      return Math.floor(num1 / num2);
  }
}