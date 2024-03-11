#  Problem Link: https://leetcode.com/problems/palindrome-number/description/

#  Time and Space Complexity: O(n)

#  Performace:
#      RunTime:   55 ms      ( better then 14,65% of users of Python) Lowest Runtime
#       Memory:   11,68 MB  ( better then 47,71% of users of Python) 

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        count = 0
        number = str(x);

        if(x < 0 ): 
            return False;

        while (count != len(number)):
          if(number[count] != number[(len(number) -1) - count]):
              return False
          count += 1

        return True