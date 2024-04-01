// Problem Link: 

// Space Complexity: O(n) 
//  Time Complexity: O(n)

// Performace:
//     RunTime:   61    ms  ( better then 63,24% of users of JavaScript )
//      Memory:   58.08 MB  ( better then 34,07% of users of JavaScript ) 

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
      return parseInt(num1 / num2);
  }
}