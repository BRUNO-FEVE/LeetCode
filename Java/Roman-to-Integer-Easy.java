// Problem Link: https://leetcode.com/problems/palindrome-number/description/

// Understanding the Problem: https://excalidraw.com/#json=R1b541N2o5Lg1qSFRNz8G,GhwcbvkAsAxxqDG6UZs9uA

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