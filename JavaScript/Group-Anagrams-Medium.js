// Problem Link: https://leetcode.com/problems/group-anagrams/description/

// Space Complexity: O(n * m * log m) 
//  Time Complexity: O(n * m * log m)

// n = number of strings in the array 
// m = average length of the strings

// Performace:
//     RunTime:   122   ms  ( better then 42,56% of users of JavaScript )
//      Memory:   62.71 MB  ( better then 57,42% of users of JavaScript ) 


/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let map = new Map()
    let response = [[]]

    for (let i=0; i<strs.length; i++) {
      const element = strs[i].split("").sort().join("");
      
      if (map.has(element)) {
        response[map.get(element)].push(strs[i])
      } else {
        map.set(element, response.length)
        response.push([strs[i]])
      }
      
    }

    return response;
};