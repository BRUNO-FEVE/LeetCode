// Problem Link: https://leetcode.com/problems/min-stack/description/

// First Solution 

// Performace:
//     RunTime:   74 ms     ( better then 05,00% of users of Java )
//      Memory:   44.68 MB  ( better then 68,09% of users of Java ) 


package Java;

class MinStack {
  Node head;

  public MinStack() {
    this.head = null;
  }
  
  public void push(int val) {
      if (this.head == null) {
        this.head = new Node(val);
      } else {
        Node newHead = new Node(val, this.head);
        this.head = newHead;
      }
  }
  
  public void pop() {
      if (this.head.prev == null) {
        this.head = null;
      } else {
        this.head = this.head.prev;
      }
  }
  
  public int top() {
      return this.head.val;
  }
  
  public int getMin() {
    Node curr = this.head;
    int min = Integer.MAX_VALUE;
    while (curr != null) {
        if (min > curr.val) {
          min = curr.val;
        }
        curr = curr.prev;
    }
    return min;
  }
}

class Node {
  public int val;
  public Node prev;

  public Node(int val) {
    this.val = val;
    this.prev = null;
  }

  public Node(int val, Node prev) {
    this.val = val;
    this.prev = prev;
  }
}

/**
* Your MinStack object will be instantiated and called as such:
* MinStack obj = new MinStack();
* obj.push(val);
* obj.pop();
* int param_3 = obj.top();
* int param_4 = obj.getMin();
*/