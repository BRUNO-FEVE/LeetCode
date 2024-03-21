package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Solution {
  public ListNode curr1, curr2, next1, next2 = new ListNode(0);
  public ListNode last, response = null;
  public List<Integer> allNumbers = new ArrayList<Integer>();
  
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1 == null) return list2; 
    if(list2 == null) return list1;

    ListNode response = null;

    curr1 = list1;
    curr2 = list2;

    while (curr1 != null || curr2 != null) {
      if (curr1 != null) {
        allNumbers.add(curr1.val);
        curr1 = curr1.next;
      }
      if (curr2 != null) {
        allNumbers.add(curr2.val);
        curr2 = curr2.next;
      }
    }

    Collections.sort(allNumbers);

    for(int i=0; i<allNumbers.size(); i++) {
      if (i==0) {
        response = new ListNode(allNumbers.get(i));
        last = response;
      } else {
        ListNode curr = new ListNode(allNumbers.get(i));
        last.next = curr;
        last = curr;
      }
    }

    return response;
}

}