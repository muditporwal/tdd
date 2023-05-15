package org.bank;

class ListNode {
  int val;
  ListNode next;

  ListNode() {}

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode reverse(ListNode node) {
    if (node.next == null) {
      return node;
    } else {
      ListNode head = reverse(node.next);
      head.next = node;
    }
  }

  public int size() {
    ListNode node = this;
    int size = 0;
    while (node != null) {
      size++;
      node = node.next;
    }
    return size;
  }
}
