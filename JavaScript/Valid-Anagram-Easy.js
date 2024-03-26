// Problem Link: https://leetcode.com/problems/valid-anagram/description/

// Space Complexity: O(n)
//  Time Complexity: O(nˆ3)

// Performace:
//     RunTime:   366   ms  ( better then 05,06% of users of Java )
//      Memory:   55.82 MB  ( better then 06,37% of users of Java ) 


/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
  if(s.length != t.length) return false 

  for (let i = 0; i < s.length; i++) {
    t = t.replace(s.charAt(i), "")
  }

  if(t.length == 0) return true
  return false
};