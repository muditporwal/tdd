package org.bank;

class LLNode {

  private final ListNode head;
  private ListNode tail;
  private int size;

  public LLNode(ListNode head) {
    this.head = head;
    this.tail = head;
    this.size = 1;
  }

  public int size() {
    return size;
  }

  public ListNode add(ListNode node) {
    tail.next = node;
    size = size + 1;
    tail = node;
    return head;
  }

  public LLNode reverseList(ListNode e) {
    return this;
  }


}
