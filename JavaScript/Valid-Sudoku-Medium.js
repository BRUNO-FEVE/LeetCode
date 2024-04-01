// Problem Link: https://leetcode.com/problems/valid-sudoku/description/

// Space Complexity: O(1)
//  Time Complexity: O(nˆ2)

// Performace:
//     RunTime:   68   ms   ( better then 60,67% of users of JavaScript )
//      Memory:   53.01 MB  ( better then 44,41% of users of JavaScript ) 

/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
  let uniqueElementsGrids = new Array(9).fill(null).map(() => new Set())
  for(let i=0; i<board.length; i++) {
    let uniqueElementsRow = new Set()
    let uniqueElementsColum = new Set()
    for (let j=0; j<board[i].length; j++) {

      if (board[i][j] !== ".") {
        // Rows Verification 
        if (uniqueElementsRow.has(parseInt(board[i][j]))) {
          return false
        } else {
          uniqueElementsRow.add(parseInt(board[i][j]))
        } 

        // Grid Verification
        let uniqueGrideIndex = Math.floor(i/3) * 3 + Math.floor(j/3)
        if (uniqueElementsGrids[uniqueGrideIndex].has(parseInt(board[i][j]))) {
          return false
        } else {
          uniqueElementsGrids[uniqueGrideIndex].add(parseInt(board[i][j]))
        }
      }

      // Columns Verification 
      if (board[j][i] !== ".") {
        if(uniqueElementsColum.has(parseInt(board[j][i]))) {
          return false
        } else {
          uniqueElementsColum.add(parseInt(board[j][i]))
        }  
      }
    }
  }
  return true;
};