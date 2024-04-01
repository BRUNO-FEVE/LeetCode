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

// Improved Solution: O(1) on each function

// Performace:
//     RunTime:   3 ms      ( better then 100% of users of Java )
//      Memory:   44.56 MB  ( better then 79,64% of users of Java ) 

class MinStack {
  Node head;

  public MinStack() {
    this.head = null;
  }
  
  public void push(int val) {
      if (this.head == null) {
        this.head = new Node(val);
      } else {
        Node newHead = new Node(val, Math.min(val, this.head.min), this.head);
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
    return this.head.min;
  }
}

class Node {
  public int val;
  public int min;
  public Node prev;

  public Node(int val) {
    this.val = val;
    this.min = val;
    this.prev = null;
  }

  public Node(int val, int min, Node prev) {
    this.val = val;
    this.min = min;
    this.prev = prev;
  }
}