// Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

// First Solution

// Space Complexity: O(1)
//  Time Complexity: O(n * m)

// Performace:
//     RunTime:   70 MS     ( better then 05,12% of users of Javascript )
//      Memory:   49.75 MB  ( better then 49,75% of users of Javascript )

/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  for (let i = 0; i < haystack.length; i++) {
    if (haystack.charAt(i) === needle.charAt(0)) {
      if (needle.length === 1) return i;
      for (let j = 1; j < needle.length; j++) {
        if (haystack.charAt(i + j) !== needle.charAt(j)) {
          break;
        }
        if (j === needle.length - 1) {
          return i;
        }
      }
    }
  }
  return -1;
};

// Second Solution

// Space Complexity: O(m)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   44 MS     ( better then 92,05% of users of Javascript )
//      Memory:   48.70 MB  ( better then 74,20% of users of Javascript )

/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function (haystack, needle) {
  if (haystack.length < needle.length) {
    return -1;
  }

  for (let i = 0; i < 1 + haystack.length - needle.length; i++) {
    let tempWord = haystack.slice(i, i + needle.length);
    if (tempWord === needle) {
      return i;
    }
  }

  return -1;
};
