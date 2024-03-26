package Java;

import java.util.HashMap;

class Solution {
  public boolean isAnagram(String s, String t) {
    HashMap<Character, Integer> tEdited = new HashMap<Character, Integer>(t);

    for(int i=0; i<s.length(); i++) {
      int index = tEdited.indexOf(s.CHA(i) + "");
      if (index == -1) {
        return false;
      } 
      tEdited.delete(index, 1);
    }


    if (t.isEmpty()) {
      return true;
    }
    return false;
  }
}