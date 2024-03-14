// Problem Link: https://leetcode.com/problems/add-two-numbers/description/

// Time and Space Complexity: O(n)

// Performace:
//     RunTime:   1 ms      ( better then 100% of users of Java ) Lowest Runtime
//      Memory:   44.40 MB  ( better then 44,24% of users of Java ) 

class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {  

      ListNode curr1 = l1;
      ListNode curr2 = l2;
      ListNode head = null;
      ListNode temp = null;

      int rise = 0;

      while (curr1 != null || curr2 != null || rise != 0) {

        if(curr1 == null) curr1 = new ListNode(0) ;
        if(curr2 == null) curr2 = new ListNode(0);

        int number = curr1.val + curr2.val + rise;
        
        if(rise == 1) {
           rise -= 1; 
        }

        if (number >= 10) {
          number -= 10;
          rise += 1;
        }

        ListNode current = new ListNode(number);

        if(temp == null) {
            temp = new ListNode(number);
            head = temp;
        } else {
            temp.next = current;
            temp = current;
        }

        curr1 = curr1.next;
        curr2 = curr2.next;
      }

       return  head;
  }
}
 