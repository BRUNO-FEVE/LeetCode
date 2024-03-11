// Problem Link: https://leetcode.com/problems/palindrome-number/description/

// Understanding the Problem: https://excalidraw.com/#json=R1b541N2o5Lg1qSFRNz8G,GhwcbvkAsAxxqDG6UZs9uA

// First Solution 

// Space Complexity: O(1)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   5 ms      ( better then 59,16% of users of Java )
//      Memory:   44.63 MB  ( better then 57,15% of users of Java ) 


package Java;
import java.util.HashMap;
class Solution {
  public int romanToInt(String s) {
    HashMap<Character, Integer> numberConversion = new HashMap<Character, Integer>();

    numberConversion.put('I', 1);
    numberConversion.put('V', 5);
    numberConversion.put('X', 10);
    numberConversion.put('L', 50);
    numberConversion.put('C', 100);
    numberConversion.put('D', 500);
    numberConversion.put('M', 1000);

    int charLocation = 0;
    int totalValue = 0;

    while (charLocation < s.length()) {
      Character current = s.charAt(charLocation);
      if(charLocation == s.length()-1) {
        totalValue += numberConversion.get(current);
        break;
      }

      if(numberConversion.get(current) < numberConversion.get(s.charAt(charLocation+1))) {
        totalValue += numberConversion.get(s.charAt(charLocation+1)) - numberConversion.get(current); 
        charLocation += 2;
      } else {
        totalValue += numberConversion.get(current);
        charLocation++;
      }
    }

    return totalValue;
  }
}

// Improved Solution: Improving using switch and for.

// Understanding the Problem: https://excalidraw.com/#json=R1b541N2o5Lg1qSFRNz8G,GhwcbvkAsAxxqDG6UZs9uA

// Space Complexity: O(1)
//  Time Complexity: O(n)

// Performace:
//     RunTime:   4 ms      ( better then 67,92% of users of Java )
//      Memory:   44.35 MB  ( better then 90,82% of users of Java ) 

class ImprovedSolution {
  public int romanToInt(String s) {

    int totalValue = 0;

    for(int i=0; i<s.length(); i++) {
      if(i != s.length()-1 &&  convertRoman(s.charAt(i)) < convertRoman(s.charAt(i+1))) {
        totalValue -= convertRoman(s.charAt(i)); 
      } else {
        totalValue += convertRoman(s.charAt(i));
      }
    }

    return totalValue;
  }

  public int convertRoman(Character c) {
    switch (c) {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
    }
    return 0;
    }
  }
